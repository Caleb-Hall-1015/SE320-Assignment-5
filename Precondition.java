import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Write a precondition or requires clause for the method removeDuplicates, so all duplicates from List lst are removed.
 */

public class Precondition
{
	/**
	 * Removes all duplicates in the list
	 * @param lst list to search
	 * requires: at least one element within lst has a duplicate
	 */
	public static void removeDuplicates(List lst) 
	{ 
		if (lst == null || lst.size() == 0) return; 
		
		List copy = new ArrayList(lst); 
		Iterator elements = copy.iterator(); 
		Object pre = elements.next(); 
		
		while(elements.hasNext()) 
		{ 
			Object nex = elements.next(); 
			
			if (pre.equals(nex))
			{
				lst.remove(nex); 
			} else 
			{
				pre = nex; 
			}
		} 
	} 
}
