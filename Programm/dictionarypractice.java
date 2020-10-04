import java.util.HashMap;
import java.util.Map;

public class dictionarypractice
{
	public static void main(String args[])
	{
		//English to bangala dictionary
		Map<String,String> englBanDictionary = new HashMap<String,String>();
		englBanDictionary.put("Sombar","Monday");
		englBanDictionary.put("Mongalbar","Tuesday");
		englBanDictionary.put("Budhabar","Wednesday");
		englBanDictionary.put("Brishpatibar","Thursday");
		englBanDictionary.put("Sukrabar","Friday");
		englBanDictionary.put("Sonybar","Satarday");
		
		System.out.println(englBanDictionary.get("Sombar"));
		System.out.println(englBanDictionary.get("Sonybar"));
		
		System.out.println(englBanDictionary.keySet());
		System.out.println(englBanDictionary.values());
		
		System.out.println(englBanDictionary.size());
		
		Map<String,Boolean> shoppingList = new HashMap<String,Boolean>();
		shoppingList.put("Ham",true);
		shoppingList.put("Bread",Boolean.TRUE);
		shoppingList.put("Oreos",Boolean.TRUE);
		shoppingList.put("Sugar",false);
		
		System.out.println(shoppingList.get("Ham"));
		System.out.println(shoppingList.get("Sugar"));
		
		System.out.println(englBanDictionary.toString());
		System.out.println(shoppingList.toString());
		System.out.println(shoppingList.isEmpty());
		
		shoppingList.remove("Eggs");
		
		shoppingList.replace("Bread",Boolean.FALSE);
		
		
		shoppingList.clear();
		System.out.println(shoppingList.toString());
		System.out.println(shoppingList.isEmpty());
	}
}