boolean isPermutation(String a, String b){
	if(a.length() != b.length()){
		return false;
	}
	Map<String, Integer> map = new HashMap<String, Integer>();
	int i;
	for(i = 0; i < a.length(); i++){
		map.put(a.charAt(i), getOrDefault(a.charAt(i), 0) + 1);
	}
	for(i = 0; i < a.length(); i++){
		if(!map.containsKey(b.charAt(i))){
			return false;
		}
		if(map.get(s.charAt(i)) == 1){
			map.remove(s.charAt(i));
		}
		else{
			map.put(s.charAt(i), get(s.charAt(i) - 1));
		}
	}
	return true;
}
