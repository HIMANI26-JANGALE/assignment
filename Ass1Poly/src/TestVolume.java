
public class TestVolume {

	public static void main(String[] args) {
		Instrument t1[]=new Instrument[10];
		t1[0]=new Piano();
		t1[1]=new Flute();
		t1[2]=new Guitar();
		t1[3]=new Piano();
		t1[4]=new Piano();
		t1[5]=new Flute();
		t1[6]=new Piano();
		t1[7]=new Flute();
		t1[8]=new Piano();
		t1[9]=new Flute();
		
		/*if(t1[1] instanceof Flute)
			t1[1].findVolume();
		if(t1[0] instanceof Piano)
			t1[0].findVolume();*/
		for(int i=0;i<t1.length;i++){
			if(t1[i] instanceof Piano){
				t1[i].findVolume();
			}
			else if(t1[i] instanceof Guitar){
				t1[i].findVolume();
			}
			else if(t1[i] instanceof Flute){
				t1[i].findVolume();
			}
		}
	}	
}


