boolean isUnique(String s){
	if(s.length() > 128){
		return false;
	}
	int[] arr = new int[128];
	for(int i = 0; i < s.length(); i++){
		if(arrr[s.charAt(i)] == 1){
			return false;
		}
		else{
			arr[s.charAt(i)] = 1;
		}
	} 
	return true;
}
