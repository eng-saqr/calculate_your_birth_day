package com.example.calculateyourbirthday;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;


public class main extends AppCompatActivity {
    TextView day;
    TextView month;
    TextView year;
    Button calculate;
    TextView result;
    TextView Horoscopes;
    TextView textView ;
    int years , months , days ;
    int day_input , month_input , year_input ;
    int full_days ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void btnaction(View view) {
        day = findViewById(R.id.txt1);
        month = findViewById(R.id.txt2);
        year = findViewById(R.id.txt3);
        result = findViewById(R.id.textView);
        Horoscopes = findViewById(R.id.textView2);
        textView = findViewById(R.id.textView1);
        day_input =  Integer.parseInt( day.getText().toString()) ;
        month_input =  Integer.parseInt( month.getText().toString()) ;
        year_input=  Integer.parseInt( year.getText().toString());


        LocalDate localDate = LocalDate.now() ;
        LocalDate birthday = LocalDate.of(year_input , month_input , day_input ) ;
        years = Period.between(birthday , localDate).getYears() ;
        months = Period.between(birthday , localDate).getMonths() ;
        days= Period.between(birthday , localDate).getDays() ;
        full_days = (int) ChronoUnit.DAYS.between(birthday,localDate);
        result.setText(" عمرك الأن  "+String.valueOf(years)+" سنة و "+String.valueOf(months)+" شهور و "+String.valueOf(days)+" أيام ");
        textView.setText( " لقد عشت حتي الان " + full_days +" يوما " );


        //////////////////////////////////////////برج الحمل//////////////////////////////////
        for(int i = 21; i <= 31; i++){
            if ( day_input ==i){
                if( month_input ==3 ){
                    Horoscopes.setText("وانت من برج الحمل \nالصفات : الثقة بلنفس ويغضب في اتفة المواقف");

        }}}

        for(int i = 1; i <= 19; i++){
            if ( day_input  == i ){
                if( month_input == 4 ){
                    Horoscopes.setText("وانت من برج الحمل \nالصفات:الثقة بلنفس ويغضب في اتفة المواقف");

                }}}

        //////////////////////////////////////////برج الثور//////////////////////////////////

        for(int i = 20; i <= 30; i++){
            if ( day_input == i ){
                if( month_input == 4 ){
                    Horoscopes.setText("وانت من برج الثور \nالصفات :أهم ما يميزه شخصيته الديبلوماسية و أهم عيوبه عند الغضب يفقد أعصابه بسرعة كبيرة");
                }}}
        for(int i = 1; i <= 20; i++){
            if ( day_input == i ){
                if( month_input == 5 ){
                    Horoscopes.setText("وانت من برج الثور \nالصفات :أهم ما يميزه شخصيته الديبلوماسية و أهم عيوبه عند الغضب يفقد أعصابه بسرعة كبيرة");
                }}}

        //////////////////////////////////////////برج الجوزاء//////////////////////////////////

        for(int i = 21; i <= 31; i++){
            if ( day_input == i ){
                if( month_input == 5 ){
                    Horoscopes.setText("وانت من برج الجوزاء \nالصفات :أهم ما يميّزه أنه شخصية ذكية ومحللة لمن حولها جيدا وأهم عيوبه أن مواليده لهم جانبان، جانب عاطفي إلى أبعد مدى، وجانب آخر جاف يكره العواطف");
                }}}

        for(int i = 1; i <= 20; i++){
            if ( day_input == i ){
                if( month_input == 6 ){
                    Horoscopes.setText("وانت من برج الجوزاء \nالصفات :أهم ما يميّزه أنه شخصية ذكية ومحللة لمن حولها جيدا وأهم عيوبه أن مواليده لهم جانبان، جانب عاطفي إلى أبعد مدى، وجانب آخر جاف يكره العواطف");
                }}}

        //////////////////////////////////////////برج السرطان//////////////////////////////////

        for(int i = 21; i <= 30; i++){
            if ( day_input == i ){
                if( month_input == 6 ){
                    Horoscopes.setText("وانت من برج السرطان \nالصفات :أهم مميزاته أنه شخصية حالمة وحساسة لديها خيال واسع أبرز عيوبه تقلب المزاج بشكل كبير");

                }}}

        for(int i = 1; i <= 22; i++){
            if ( day_input == i ){
                if( month_input == 7 ){
                    Horoscopes.setText("وانت من برج السرطان \nالصفات :أهم مميزاته أنه شخصية حالمة وحساسة لديها خيال واسع أبرز عيوبه تقلب المزاج بشكل كبير");

                }}}

        //////////////////////////////////////////برج الأسد//////////////////////////////////

        for(int i = 23; i <= 31; i++){
            if ( day_input == i ){
                if( month_input == 7 ){
                    Horoscopes.setText("وانت من برج الأسد \nالصفات :أبرز مميّزاته الصراحة إلى أبعد مدى وحبه للمغامرة وتنحصر عيوبه في حبه للبقاء تحت الأضواء بشكل دائم");

                }}}

        for(int i = 1; i <= 22; i++){
            if ( day_input == i ){
                if( month_input == 8 ){
                    Horoscopes.setText("وانت من برج الأسد \nالصفات :أبرز مميّزاته الصراحة إلى أبعد مدى وحبه للمغامرة وتنحصر عيوبه في حبه للبقاء تحت الأضواء بشكل دائم");

                }}}

        //////////////////////////////////////////برج العذراء//////////////////////////////////

        for(int i = 23; i <= 31; i++){
            if ( day_input == i ){
                if( month_input == 8 ){
                    Horoscopes.setText("وانت من برج العذراء \nالصفات :أهم مميزاته قدرته الكبيرة على تحليل الأمور أبرز ما يعيبه هو انتقاد من حوله");
                }}}

        for(int i = 1; i <= 22; i++){
            if ( day_input == i ){
                if( month_input == 9 ){
                    Horoscopes.setText("وانت من برج العذراء \nالصفات :أهم مميزاته قدرته الكبيرة على تحليل الأمور أبرز ما يعيبه هو انتقاد من حوله");

                }}}
        //////////////////////////////////////////برج الميزان//////////////////////////////////

        for(int i = 23; i <= 30; i++){
            if ( day_input == i ){
                if( month_input == 9 ){
                    Horoscopes.setText("وانت من برج الميزان \nالصفات :يمتاز بشخصية ديبلوماسية كما يمكن التفاهم معه بكل سهولة");

                }}}

        for(int i = 1; i <= 23; i++){
            if ( day_input == i ){
                if( month_input == 10 ){
                    Horoscopes.setText("وانت من برج الميزان \nالصفات : يمتاز بشخصية ديبلوماسية كما يمكن التفاهم معه بكل سهولة");

                }}}

        //////////////////////////////////////////برج العقرب//////////////////////////////////

        for(int i = 24; i <= 31; i++){
            if ( day_input == i ){
                if( month_input == 10 ){
                    Horoscopes.setText("وانت من برج العقرب \nالصفات : يمتاز بنظرة ثاقبة لمن حوله يعيبه أنه يكتم كل مشاعره بداخله");

                }}}

        for(int i = 1; i <= 21; i++){
            if ( day_input == i ){
                if( month_input == 11 ){
                    Horoscopes.setText("وانت من برج العقرب \nالصفات : يمتاز بنظرة ثاقبة لمن حوله يعيبه أنه يكتم كل مشاعره بداخله");

                }}}
        //////////////////////////////////////////برج القوس//////////////////////////////////

        for(int i = 22; i <= 30; i++){
            if ( day_input == i ){
                if( month_input == 11 ){
                    Horoscopes.setText("وانت من برج القوس \nالصفات : أهم مميزاته أنه شخصية اجتماعية ويحب من حوله ");

                }}}

        for(int i = 1; i <= 21; i++){
            if ( day_input == i ){
                if( month_input == 12 ){
                    Horoscopes.setText("وانت من برج القوس \nالصفات : أهم مميزاته أنه شخصية اجتماعية ويحب من حوله ");

                }}}

        //////////////////////////////////////////برج الجدي//////////////////////////////////

        for(int i = 22; i <= 31; i++){
            if ( day_input == i ){
                if( month_input == 12 ){
                    Horoscopes.setText("وانت من برج الجدي \nالصفات : يتميّز بالجدّية والقدرة الملحوظة على فهم الآخرين يعيبه عدم أخذ الأمور بتساهل  ");

                }}}

        for(int i = 1; i <= 19; i++){
            if ( day_input == i ){
                if( month_input == 1 ){
                    Horoscopes.setText("وانت من برج الجدي \nالصفات : يتميّز بالجدّية والقدرة الملحوظة على فهم الآخرين يعيبه عدم أخذ الأمور بتساهل  ");

                }}}

        //////////////////////////////////////////برج الدلو//////////////////////////////////

        for(int i = 20; i <= 31; i++){
            if ( day_input == i ){
                if( month_input == 1 ){
                    Horoscopes.setText("وانت من برج الدلو \nالصفات : يتميّز بنظرة مساواة للآخرين دون تمييز يعيبه ردود فعله غير المتوقعة ");

                }}}

        for(int i = 1; i <= 18; i++){
            if ( day_input == i ){
                if( month_input == 2 ){
                    Horoscopes.setText("وانت من برج الدلو \nالصفات : يتميّز بنظرة مساواة للآخرين دون تمييز يعيبه ردود فعله غير المتوقعة ");

                }}}
        //////////////////////////////////////////برج الحوت//////////////////////////////////

        for(int i = 19; i <= 28; i++){
            if ( day_input == i ){
                if( month_input == 2 ){
                    Horoscopes.setText("وانت من برج الحوت \nالصفات : يتميّز بخياله الخصب والواسع أبرز عيوبه ثقته بالجميع دون استثناء ");

                }}}

        for(int i = 1; i <= 20; i++){
            if ( day_input == i ){
                if( month_input == 3){
                    Horoscopes.setText("وانت من برج الحوت \nالصفات : يتميّز بخياله الخصب والواسع أبرز عيوبه ثقته بالجميع دون استثناء ");

                }}}
        //result.setText("The Name Of ALLAH");
        //Toast.makeText(getApplicationContext()," عمرك الأن  "+String.valueOf(finalyear)+" سنة و "+String.valueOf(finalmonth)+" شهور و "+String.valueOf(finalday)+" أيام ",Toast.LENGTH_LONG).show();

    }
}