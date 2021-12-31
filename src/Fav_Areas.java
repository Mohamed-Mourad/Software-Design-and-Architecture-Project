import java.util.ArrayList;
import java.util.Arrays;

public class Fav_Areas {

	protected ArrayList<String> Sources = new ArrayList<String>();

	public void AddFavArea(String Src) {
		Sources.add(Src);
	}

	public ArrayList<String> getFavAreas() {
		return Sources;
	}

	public String removeFavArea(String area) {
		String not_found = "Area Has been removed.";
		if (!Sources.remove(area)) {
			not_found = "Area not found.";
		}
		return not_found;
	}
	public String toString() {
		return ("sources: " + Arrays.toString(Sources.toArray()));

	}

}
