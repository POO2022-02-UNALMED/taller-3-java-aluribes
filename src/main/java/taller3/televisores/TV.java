package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal=1;
    private int precio=500;
    private boolean estado;
    private int volumen=1;
    private Control control;
    private static int numTV=0;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        TV.numTV++;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        if (canal<=120 && estado && canal>=1){
            this.canal = canal;
        }
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        if (volumen<=7 && estado && volumen>=0){
            this.volumen = volumen;
        }
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public static int getNumTV() {
        return numTV;
    }

    public static void setNumTV(int numTV) {
        TV.numTV = numTV;
    }

    public void turnOn() {
        this.estado=true;
    }
    
    public void turnOff() {
        this.estado=false;
    }

    public boolean getEstado() {
        return estado;
    }

    public void canalUp(){
        if (canal<120 && estado){
            this.canal+=1;
        }
    }

    public void canalDown(){
        if (canal>1 && estado){
            this.canal-=1;
        }
    }

    public void volumenUp(){
        if (volumen<7 && estado){
            this.volumen+=1;
        }
    }

    public void volumenDown(){
        if (volumen>0 && estado){
            this.volumen-=1;
        }
    }    
}
