public class RobotHerbDiv2 {
    int x = 0;
    int y = 0;
    boolean isY = true;
    boolean isForward = true;
	public int getdist(int T, int[] a) {
        for(int i=0; i<T; i++){
            runProgram(a);
        }
		return Math.abs(x)+Math.abs(y);
	}
    public void runProgram(int[] a){
        for(int i=0;i<a.length;i++){
            if(isY){
                y += (isForward ? 1 : -1) * a[i];
            }else{
                x += (isForward ? 1 : -1) * a[i];
            }
            setDirection(a[i]%4);
        }
    }
    public void setDirection(int i){
        switch (i){
            case 0:
                break;
            case 1:
                if(isY&&isForward) isY = false;
                else if(!isY&&isForward){
                    isY = true;
                    isForward = false;
                }
                else if(isY&&!isForward){
                    isY = false;
                }
                else{
                    isY = true;
                    isForward = true;
                }
                break;
            case 2:
                isForward = !isForward;
                break;
            case 3:
                isForward = !isForward;
                if(isY&&isForward) isY = false;
                else if(!isY&&isForward){
                    isY = true;
                    isForward = false;
                }
                else if(isY&&!isForward){
                    isY = false;
                }
                else{
                    isY = true;
                    isForward = true;
                }
                break;
        }
    }
}
