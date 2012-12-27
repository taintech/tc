package SRM495;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: Tain
 * Date: 02.08.11
 * Time: 15:02
 * To change this template use File | Settings | File Templates.
 */
public class CarrotBoxesEasy{
	public int theIndex(int[] car,int k){
		int max = 0;
		int index = 0;
		for (int i=0;i<k;i++){
			index = 0;
			max = 0;
			for(int j=0;j<car.length;j++){
				if(max<car[j]){
					index = j;
					max = car[j];
				} else if(max==car[j]&&index>j){
					index = j;
					max = car[j];
				}
			}
			car[index]--;
		}
		return index;
	}
}
