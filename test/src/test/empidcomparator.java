package test;

import java.util.Comparator;

public class empidcomparator implements Comparator<Emp> {

	@Override
	public int compare(Emp arg0, Emp arg1) {
		if(arg0.getEmpid()<arg1.getEmpid())
			return 0;
			return -1;
	}

}
