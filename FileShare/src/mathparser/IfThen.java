package mathparser;

import com.bestcode.mathparser.IFunction;
import com.bestcode.mathparser.IParameter;

public class IfThen implements IFunction {
   
    public double run(IParameter[] p){
    	if(p[0].getValue() > 0.0) {
		   return p[1].getValue();
	   	} else {
		   return 0;
	   	}	   
    }

	@Override
	public int getNumberOfParams() {
		return 2;
	}   

}
