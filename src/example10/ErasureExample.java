package example10;

import java.util.List;

public class ErasureExample<T, V extends Comparable<V>> {
	public void unBounded(T parameter) {
		// This method has unbounded parameter that will be converted to Object
	}

	public void bounded(V parameter) {
		// This method has bounded wildcard
	}

	// This method has 2 list paramters will be changed from string to list and other from list of list to list
	public void lists(List<String> paramters, List<List<T>> parameters2) {
		String str = paramters.get(0);
	}
}
