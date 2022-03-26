package pacoteprojetosingleton;

	public class SingletonLazyHolder {
		
		private static class InstanceHolder{
		
		private static SingletonLazyHolder instancia = new SingletonLazyHolder();// thread safe
		
		}
		
		private SingletonLazyHolder() {
			super();
		}
		
		public static SingletonLazyHolder getInstancia() {
			
			return InstanceHolder.instancia;

		}
		
	}


