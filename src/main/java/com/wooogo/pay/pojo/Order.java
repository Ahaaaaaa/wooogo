package com.wooogo.pay.pojo;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "w_user")
@EntityListeners(AuditingEntityListener.class)
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "商品id不能为空")
    private String product_id;

    @Size(max =30,message = "商品描述长度要求不能超过30")
    private String body;

    // 商品详情
    private String detail;

    // 附加数据
    private String attach;

    // 金额
    @NotNull(message = "商品价格不能为空")
    private BigDecimal total_fee;

    // 交易起始时间
    @CreatedDate
    private Long time_start;

    // 通知地址
    @NotNull(message = "支付回调地址不能为空")
    private String notify_url;

    // 指定支付方式
    @NotNull(message = "请指定支付方式")
    private String pay_type;
}
