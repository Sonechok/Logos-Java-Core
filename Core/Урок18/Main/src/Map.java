import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Map<K,V> {
    private ArrayList<K> arrayListOfKeys = new ArrayList<>();
    private ArrayList<V> arrayListOfValues = new ArrayList<>();

    public boolean put(K key, V value){
        int counter=0;
        for (int i = 0; i < arrayListOfKeys.size(); i++) {
            if (arrayListOfKeys.get(i).equals(key)) {
                arrayListOfValues.remove(i);
                arrayListOfValues.add(i, value);
                counter++;
            }
        }
        if (counter==0){
            arrayListOfKeys.add(key);
            arrayListOfValues.add(value);
        }
        return true;
    }

    public boolean removeKey(K key){
        int counter = 0;
        for(int i = 0; i < arrayListOfKeys.size(); i++){
            if (arrayListOfKeys.get(i).equals(key)){
                arrayListOfValues.remove(i);
                arrayListOfKeys.remove(i);
                counter++;
            }
        }
        if(counter==0){
            return false;
        } else {
            return true;
        }
    }

    public boolean removeValue(V value){
        int counter = 0;
        for(int i = 0; i < arrayListOfKeys.size(); i++){
            if (arrayListOfValues.get(i).equals(value)){
                arrayListOfKeys.remove(i);
                arrayListOfValues.remove(i);
                counter++;
                i--;
            }
        }
        if(counter==0){
            return false;
        } else {
            return true;
        }
    }

    public String keysToString(){
        String arrayOfKeys = "Keys:\n";
        for (int i = 0; i < arrayListOfKeys.size(); i++){
            arrayOfKeys += (i+1)+". "+arrayListOfKeys.get(i).toString()+"\n";
        }
        if (arrayOfKeys.equals("Keys:\n")){
            return "NONE";
        } else {
            return arrayOfKeys;
        }
    }

    public String valuesToString(){
        String arrayOfValues = "Values:\n";
        for (int i = 0; i < arrayListOfValues.size(); i++){
            arrayOfValues += (i+1)+". "+arrayListOfValues.get(i).toString()+"\n";
        }
        if (arrayOfValues.equals("Values:\n")){
            return "NONE";
        } else {
            return arrayOfValues;
        }
    }

    @Override
    public String toString() {
        String mapToString="Key\t|\tValue\n";
        for (int i = 0; i < arrayListOfKeys.size();i++){
            mapToString +=arrayListOfKeys.get(i).toString()+"\t|\t"+arrayListOfValues.get(i).toString()+"\n";
        }
        return mapToString;
    }
}
