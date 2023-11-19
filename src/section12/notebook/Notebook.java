package section12.notebook;
// 부모클래스
// 추상메서드가 1개 있어서 추상 클래스 
public abstract class Notebook {
	// 1. Macbook, Galaxybook 는 Notebook 클래스의 상속을 받는다.
	// 2. notebookBrand 메서드를 추상 메서드로 만듬
	// 3. Macbook, Galaxybook 에서 notebookBrand 메서드를 재정의
	// 4. Macbook 의 notebookBrand를 호출 시 맥북 출력
	// 5. Galaxybook 의 notebookBrand 를 호출 시 갤럭시북 출력
	String aaa;
	public abstract void notebookBrand();
}
