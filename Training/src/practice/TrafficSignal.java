class TrafficSignal {
  public static void main(String[] args) {
     int i = 0; int j = 1;
	 while (i < 10) {
		 if (j == 4) j = 1;
		 
		 switch(j) {
			 case 1: System.out.println("RED"); break;
			 case 2: System.out.println("GREEN"); break;
			 case 3: System.out.println("AMBER"); break;
		 }
		 j++;
		 i++;
	 }
  }
}