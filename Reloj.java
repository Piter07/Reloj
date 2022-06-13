package Javae003;

public class Reloj {
    private int hora;
    private int minuto;
    private int segundos;

    public Reloj() {
        hora = 12;
        minuto = 0;
        segundos = 0;
    }

    public Reloj(int hor, int min, int seg) {
        if(hor >= 0 && hor <=23)
            hora = hor;
        else if(hor == 24)
            hora = 0;
        else
            System.out.println("La hora esta fuera de lo permitido.");

        if(min >= 0 && min <=59)
            minuto = min;
        else
            System.out.println("Los minutos estan fuera de lo permitido.");

        if(min >= 0 && min <=59)
            segundos = seg;
        else
            System.out.println("Los segundos estan fuera de lo permitido.");
    }

    public Reloj(int seg) {
        if(seg <= 86400) {
            int hor, min;
            min = (int) (seg / 60);
            seg = seg - min * 60;
            hor = (int) (min / 60);
            min = min - hor * 60;
            hora = hor;
            minuto = min;
            segundos = seg;

        }else{
            System.out.println("Es mayor a lo permitido.");
        }

    }
    public void setReloj(int seg){
        if(seg <= 86400) {
            int hor, min;
            min = (seg / 60);
            seg = seg - min * 60;
            hor = (min / 60);
            min = min - hor * 60;
            hora = hor;
            minuto = min;
            segundos = seg;
        }else{
            System.out.println("Es mayor a lo permitido.");
        }
    }

    public void setHora(int hora) {
        if(hora >= 0 && hora <=23)
            this.hora = hora;
        else if(hora == 24)
            this.hora = 0;
        else
            System.out.println("La hora esta fuera de lo permitido.");
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        if(minuto >= 0 && minuto <=59)
            this.minuto = minuto;
        else
            System.out.println("Los minutos estan fuera de lo permitido.");
    }

    public void setSegundos(int segundos) {
        if(segundos >= 0 && segundos <=59)
            this.segundos = segundos;
        else
            System.out.println("Los segundos estan fuera de lo permitido.");

    }
    public int getHora() {
        return hora;
    }
    public int getMinuto() {
        return minuto;
    }
    public int getSegundos() {
        return segundos;
    }
    public void tick() {
        int segundos = this.segundos;
        int minutos = this.minuto;
        int hora = this.hora;
        segundos++;
        if(segundos > 59){
            minutos++;
            segundos = 0;
        }
        if(minutos > 59){
            hora++;
            minutos = 0;
        }
        if(hora > 23)
            hora = 0;
        this.hora = hora;
        this.minuto = minutos;
        this.segundos = segundos;
    }
    public void addReloj(Reloj reloj){

        int hora,minuto,segundos;
        hora = reloj.getHora() + this.hora;
        while(hora>23){
            hora -= 24;
        }
        minuto = reloj.getMinuto() + this.minuto;
        if(minuto > 59){
            minuto -= 60;
        }
        segundos = reloj.getSegundos() + this.segundos;
        while(segundos > 59){
            segundos -= 60;
            minuto++;
        }

        this.hora = hora;
        this.minuto = minuto;
        this.segundos = segundos;

    }
    /*
    ** metodo toString(). Debe retornar un String representando
    el objeto Reloj en el formato "[hh:mm:ss]", por ejemplo "[22:32:12]"
     */
    @Override
    public String toString(){
        String horaReloj = "";
        if( hora == 0){
            horaReloj = "00";
        }else if( hora <= 9){
            horaReloj = horaReloj + '0' + String.valueOf(hora);
        }else{
            horaReloj = String.valueOf(hora);
        }

        if( minuto == 0){
            horaReloj = horaReloj + ":00";
        }else if( minuto <= 9){
            horaReloj = horaReloj + ":0" + String.valueOf(minuto);
        }else{
            horaReloj = horaReloj +  ':' + String.valueOf(minuto);
        }

        if( segundos == 0){
            horaReloj = horaReloj + ":00";
        }else if( segundos <= 9){
            horaReloj = horaReloj + ":0" + String.valueOf(segundos);
        }else{
            horaReloj = horaReloj + ':' + String.valueOf(segundos);
        }

        return horaReloj;
    }

    public void restaReloj(Reloj reloj) {
        if(this.mayor(reloj)){
            this.hora = reloj.getHora() - this.hora;
            this.minuto = reloj.getMinuto() - this.minuto;
            this.segundos = reloj.getSegundos() - this.segundos;
        }else{
            this.hora =  this.hora  - reloj.getHora();
            this.minuto = this.minuto - reloj.getMinuto() ;
            this.segundos = this.segundos - reloj.getSegundos();
        }
    }

    public boolean mayor(Reloj reloj){
        if(this.hora > reloj.hora){
            return true;
        }else {
            if (this.hora == reloj.hora && this.minuto > reloj.minuto) {
                return true;
            } else if (this.minuto == reloj.minuto && this.segundos > reloj.minuto) {
                return true;
            }
        }
        return false;
    }
    public void tickDecrement() {
        int segundos = this.segundos;
        int minutos = this.minuto;
        int hora = this.hora;
        segundos--;
        if(segundos < 0){
            minutos--;
            segundos = 59;
        }

        if(minutos < 0){
            hora--;
            minutos = 59;
        }

        if(hora < 0)
            hora = 23;

        this.hora = hora;
        this.minuto = minutos;
        this.segundos = segundos;

    }
}
