주의 사항

함수(또는 메서드)의 길이가 15라인을 넘어가지 않도록 구현한다.

함수(또는 메서드)가 한 가지 일만 잘 하도록 구현한다.

else 예약어를 쓰지 않는다.
힌트: if 조건절에서 값을 return하는 방식으로 구현하면 else를 사용하지 않아도 된다.
else를 쓰지 말라고 하니 switch/case로 구현하는 경우가 있는데 switch/case도 허용하지 않는다.

Java Enum을 적용한다.

도메인 로직에 단위 테스트를 구현해야 한다. 단, UI(System.out, System.in, Scanner) 로직은 제외한다.
핵심 로직을 구현하는 코드와 UI를 담당하는 로직을 분리해 구현한다.

단위 테스트 작성이 익숙하지 않다면 test/java/lotto/LottoTest를 참고하여 학습한 후 테스트를 구현한다.

//////////////////////////////////////////////////////////////////////////

구입금액 입력받기 - input
당첨번호 입력받기 - input
보너스 번호 입력받기 - input
구입금액/1000하여 몫만큼 로또 발행 (리스트 형식으로해서 contains쓰는게 좋을 듯)
발행한 로또 출력하기 - output
당첨번호와 비교하여 당첨내역 확인 (1등~5등 ENUM)
당첨내역 출력하기 - output
당첨총금액/구매금액 을 통해 수익률 계산
수익률 출력 - output
에러 처리 
