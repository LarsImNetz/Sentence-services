package org.lla_private.service.showmemore;

public class ShowMeMore implements IShowMeMore {

	public String more() {
		StringBuilder builder = new StringBuilder();

		for (int i=0;i<2*65536;i+=64) {
			builder.append(createLine(i));			
		}
		return  builder.toString();
	}
	
	private String createLine(int value) {
		StringBuilder builder = new StringBuilder();
		builder.append("Character from " + value + " to " + String.valueOf((value + 64)) + " : ");
		for (int i=value;i< value + 64;i++) {
			builder.append(createValue(i)).append(" ");
		}
		builder.append("<br/>");
		return builder.toString();
	}

	private String createValue(int value) {
		return "&#" + value + ";";
//		StringBuilder builder = new StringBuilder();
//		builder.append("&#").append(value).append(";");
//		return builder.toString();
	}
}
