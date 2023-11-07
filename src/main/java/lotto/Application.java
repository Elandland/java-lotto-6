package lotto;


import lotto.controller.LottoPlay;
import lotto.view.Input;
import lotto.view.Message;
import lotto.view.Output;


public class Application {
    public static void main(String[] args) {

        Input input = new Input();
        Output output = new Output();
        LottoPlay lottoPlay = new LottoPlay();

        lottoPlay.play(input,output);
        System.out.println(Message.WINNING_STATISTICS.getContent());
    }
}
