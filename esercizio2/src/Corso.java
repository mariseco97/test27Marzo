import java.util.ArrayList;

public class Corso {

    private ArrayList<Esame> listaEsami;
    public void Corso(ArrayList<Esame> listaEsami) {
        this.listaEsami = listaEsami;
    }

    public int votoMinimo(ArrayList<Esame> listaEsami){
        int i;
        Esame tmp = listaEsami.get(0);

        for (Esame esame: listaEsami
             ) {
            if( esame.getVoto() < tmp.getVoto() ){
                tmp = esame;
            }

        }
        return tmp.getVoto();
    }

    public void studentiPeggiori(){
        for (Esame esame: listaEsami
             ) {

        }
    }

}
