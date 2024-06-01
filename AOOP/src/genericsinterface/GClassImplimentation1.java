package genericsinterface;

public class GClassImplimentation1<E> implements GInterface<E>  //then we need to keep implements GInterface<Integer>
{																//but there is no need to mention for class
																//we can just keep as GClassImplimentation1 
	private E e;
	@Override
	public void setVale(E e)
	{
		this.e=e;
	}
	public E getValue()
	{
		return e;
	}
}
