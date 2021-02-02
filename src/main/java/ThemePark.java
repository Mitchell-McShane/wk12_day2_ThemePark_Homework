import behaviours.IReviewed;

import java.util.ArrayList;

public class ThemePark {
    ArrayList<IReviewed> iReviewed;

    public ThemePark(ArrayList<IReviewed> iReviewed){
        this.iReviewed = iReviewed;
    }

    public ArrayList<IReviewed> getAllReviewed(){
        return iReviewed;
    }
}
