import java.util.ArrayList;

public class Diapason {

    private int begin;
    private int end;
    private ArrayList<Integer> arrayList = new ArrayList<>();

    public Diapason(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    public void createArray (){
        for (int i = begin; i < end; i++){
            arrayList.add(i);
        }
    }
    public int diapasonSize(){
        return arrayList.size();
    }
    public boolean checkDiapasone() {
        return end > begin;
    }

    public void setBegin(int begin) {
        this.begin = begin;
    }

    public void setEnd(int end) {
        this.end = end;
    }
}
