package classes;

public class CashDenominations {
	public int fiveHundred;
	public int twoThousand;
	public int oneHundred;
	
	public CashDenominations(int tT,int fH,int oH)
	{
		this.fiveHundred=fH;
		this.oneHundred=oH;
		this.twoThousand=tT;
	}
	
	public CashDenominations add(CashDenominations obj)
	{
		int tT=this.twoThousand+obj.twoThousand,fH=this.fiveHundred+obj.fiveHundred,oH=this.oneHundred+obj.oneHundred;
		CashDenominations result=new CashDenominations(tT,fH,oH);
		return result;
	}
	public CashDenominations subtract(CashDenominations obj)
	{
		int tT=this.twoThousand-obj.twoThousand,fH=this.fiveHundred-obj.fiveHundred,oH=this.oneHundred-obj.oneHundred;
		CashDenominations result=new CashDenominations(tT,fH,oH);
		return result;
	}
}
