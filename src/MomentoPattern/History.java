package MomentoPattern;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<EditorState> states =new ArrayList<>();
    //We are programing to an interface
    public void push(EditorState state){
        states.add(state);
    }
    public EditorState pop(){
        //here we need to calculate the last index of the array list
        var lastIndex= states.size()-1;
        var lastState= states.get(lastIndex);
        states.remove(lastIndex);
        return lastState;
    }
}
