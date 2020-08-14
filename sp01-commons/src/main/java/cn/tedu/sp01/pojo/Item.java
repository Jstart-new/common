package cn.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Item {
	 //��һ���޸�ID
	// 第三次修改ID
	private Integer id;
	private String name;
	private Integer number;
}