package hello.core.order;

public interface OrderService {
    // 최종 오더의 결과 값을 반영하는 로직
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
