
public class Encoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "24, FeB, 2016";
		dateExtractor(input);
	}
	public static void dateExtractor(String data){
		String[] months = {"jan","feb","march","april","may","jun","jul","aug","sep","oct","nov","dec"};
		int length = data.length();
		int day;
		String month;
		int year = Integer.parseInt((data.substring(length-4, length)));
		data = data.replace(',',' ');
		data = data.replace(" ","");
		length = data.length();
		System.out.println(data);
		month = (data.substring(length-7,length-4 )).toLowerCase();
		System.out.println("Month is:" + month);
		day =Integer.parseInt( data.substring(0,length-7));
		System.out.println("Day is:" + day);
		System.out.println("year is:" + year);
	}
	public static int julianDayCalculator(int day, int month, int year){
		return 1;
	}

}
