public class Time1 {
    private int hour;// 0-23
    private int minute;// 0-59
    private int second;// 0-59 son privados porque ya los tengo como parametros en el constructor

    //constructor
    public void setTime1(int hour, int minute, int second) {
        if (hour<0 || hour>=24 || minute<0 || minute>=60 || second<0 || second>=60){
            throw new IllegalArgumentException("!!INGRESAR  VALORES DENTRO DE LOS RANGOS VALIDOS!!");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d:",hour,minute,second);
    }
    public String toString(){
        return String.format("%d:%02d:%02d %s",((hour==0|| hour==12 )? 12:hour % 12),
                minute,second,( hour < 12 ? "AM": "PM"));
    }
}
