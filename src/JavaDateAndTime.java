//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.time.format.TextStyle;
//import java.util.Date;
//import java.util.Locale;
//
//class Result {
//
//    /*
//     * Complete the 'findDay' function below.
//     *
//     * The function is expected to d a STRING.
//     * The function accepts following parameters:
//     *  1. INTEGER month
//     *  2. INTEGER day
//     *  3. INTEGER year
//     */
//
//    public static String findDay(int month, int day, int year) {
//        Date date = new Date(year, month, day);
//        String d = new String();
//        long milli = (date.getSeconds()) * 1000;
//
//        switch(date.getDay()){
//            case 0: d ="Sunday"; break;
//            case 1: d ="Monday"; break;
//            case 2: d ="Tuesday"; break;
//            case 3: d ="Wednesday"; break;
//            case 4: d ="Thursday"; break;
//            case 5: d ="Friday"; break;
//            case 6: d ="Saturday"; break;
//        }
//        return d;
//       // return findDay(month, day, year);
//
//    }
//
//}
//
//public class JavaDateAndTime {
//    public static void main(String[] args) {//throws ParseException {
////        String input_date="date/month/year";
////        SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
////        Date dt1=format1.parse(input_date);
////        DateFormat format2=new SimpleDateFormat("EEEE");
////        return format2.format(dt1);
//
//
////        Calendar c = Calendar.getInstance();
////        c.setTime(2015, 8, 5);
////        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
//
//
//
//
//
//
////        String d = new String();
////        Date date = new Date();
////        date.setYear(2015);
////        date.setMonth(8);
////        date.setDate(6);
////
////
////        switch(date.getDay()){
////            case 0: d ="Sunday"; break;
////            case 1: d ="Monday"; break;
////            case 2: d ="Tuesday"; break;
////            case 3: d ="Wednesday"; break;
////            case 4: d ="Thursday"; break;
////            case 5: d ="Friday"; break;
////            case 6: d ="Saturday"; break;
////        }
//        //return d;
//        LocalDate.parse(                               // Generate `LocalDate` object from String input.
//                "23/2/2010" ,
//                DateTimeFormatter.ofPattern( "dd/MM/uuuu" )
//        )
//                .getDayOfWeek()                       // Get `DayOfWeek` enum object.
//                .getDisplayName(                      // Localize. Generate a String to represent this day-of-week.
//                        TextStyle.SHORT_STANDALONE ,      // How long or abbreviated. Some languages have an alternate spelling for "standalone" use (not so in English).
//                        Locale.US                         // Or Locale.CANADA_FRENCH and such. Specify a `Locale` to determine (1) human language for translation, and (2) cultural norms for abbreviation, punctuation, etc.
//                );
//
//
//
////        String input = "23/2/2010";
////        DateTimeFormatter formatter = DateTimeFormat.forPattern( "d/M/yyyy" );
////        LocalDate localDate = formatter.parseLocalDate( input );
////
////        int dayOfWeek = localDate.getDayOfWeek(); // Follows ISO 8601 standard, where Monday = 1, Sunday = 7.
////        Locale locale = Locale.US;  // Locale specifies the human language to use in determining day-of-week name (Tuesday in English versus Mardi in French).
////        DateTimeFormatter formatterOutput = DateTimeFormat.forPattern( "E" ).withLocale( locale );
////        String output = formatterOutput.print( localDate ); // 'E' is code for abbreviation of day-of-week name. See Joda-Time doc.
////        String outputQuébécois = formatterOutput.withLocale( Locale.CANADA_FRENCH ).print( localDate
//
//
//
//
//
//                //System.out.println(d);        //System.out.println(finalDay);
//
////        long milliseconds = (date.getSeconds()) * 1000;
////        date = new Date(milliseconds);
//
//// return findDay(month, day, year);
//
//
//
//        //throws NullPointerException, IOException {
////        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
////        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
////
////        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
////
////        int month = Integer.parseInt(firstMultipleInput[0]);
////
////        int day = Integer.parseInt(firstMultipleInput[1]);
////
////        int year = Integer.parseInt(firstMultipleInput[2]);
////
////        String res = Result.findDay(month, day, year);
////
////        bufferedWriter.write(res);
////        bufferedWriter.newLine();
////
////        bufferedReader.close();
////        bufferedWriter.close();
//    }
//}
