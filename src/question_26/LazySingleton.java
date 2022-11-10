package question_26;

final class LazySingleton {
	private LazySingleton(){
		public static LazySingleton getInstance(){
		return LazyHolder.INSTANCE;

		}
		private static class LazyHolder{
		private static final LazySingleton INSTANCE = new LazySingleton();
		}
		private Object readResolve(){
		return LazyHolder.INSTANCE;
		}
		}


}
