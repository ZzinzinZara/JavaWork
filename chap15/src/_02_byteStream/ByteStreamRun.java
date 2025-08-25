package _02_byteStream;
/*
 * 프로그램상의 데이터를 외부매체로 출력을 한다거나, 외부매체로부터 입력을 받아올 때 
 * 반드시 그 외부매체와 통로를 만들어야 함 => 스트림
 * 
 * 스트림(통로)의 특징
 *  - 단방향: 입력이면 입력, 출력이면 출력만 가능
 *  	=> 입력과 출력을 동시다발적으로 하고자 한다면, 입력/출력 스트림을 따로 열어야 함
 *  - 선입선출(FIFO): 통로가 파이프 개념이기에 먼저 보낸값은 먼저 나옴
 *  - 시간지연(delay)문제가 발생할 수 있음
 *  
 * 스트림의 구분
 *  - 통로의 사이즈 (1byte/2byte)
 *  	- 바이트 스트림: 1byte 짜리만 왔다갔다 할 수 있음(좁음) => InputStream/OutputStream
 *  	- 문자 스트림: 2byte 짜리만 왔다갔다 할 수 있음(넓음) => Reader/Writer
 *  - 외부매체와 직접 연결 유무
 *  	- 기반스트림: 외부매체와 직접적으로 연결되는 통로(필수)
 *  	- 보조스트림: 보조 역할을 하는 통로(속도를 빠르게 한다거나, 그외 유용한 기능들을 제공)
 *  			=> 보조스트림 단독으로 사용 불가, 반드시 기반스트림이 있어야 됨
 */			

public class ByteStreamRun {

	public static void main(String[] args) {
		ByteStreamAPI api = new ByteStreamAPI();
//		api.fileSave();
		api.fileRead();
	}
}
