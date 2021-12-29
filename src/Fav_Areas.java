import java.util.ArrayList;

public class Fav_Areas {
protected String Area;
protected ArrayList<String> FavAreas = new ArrayList<String>();


public void AddFavArea(String Area) {FavAreas.add(Area);	}

public ArrayList<String> getFavAreas(){
   return FavAreas;
}

    public String removeFavArea(String area){
    	String not_found="Area Has been removed.";
        if(!FavAreas.remove(area)){
        	not_found="Area not found.";
        }
        return not_found;
        }

}
