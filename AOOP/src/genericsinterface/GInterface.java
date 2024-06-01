package genericsinterface;

public interface GInterface<E> //if we keep GInterface<Integer> or GInterface<String> in place of GInterface<E> 
							  //directly then see in child Class
{
	public void setVale(E e);
	public E getValue();
}
