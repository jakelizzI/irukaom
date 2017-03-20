package core;

public class AbstractMapperConfig{

	/**
	 * singleton
	 */
	AbstractMapperConfig(){
	}

	/**
	 * singletonインスタンス
	 */
	private AbstractMapperConfig mapperConfig = new AbstractMapperConfig();

	/**
	 * インスタンスの取得メソッド
	 * @return
	 */
	public AbstractMapperConfig singleton(){
		return mapperConfig;
	}

	/**
	 * IrukaOMクラスのインスタンスを生成する。
	 * @return
	 */
	public IrukaOM getIrukaOM(){
		return new IrukaOM();
	}
}