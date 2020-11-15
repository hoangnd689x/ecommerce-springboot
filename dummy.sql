-- -------------------------------------------------------------------------------
-- INSERT STATEMENT
-- -------------------------------------------------------------------------------
-- Roles

insert into ecommerce.roles (roleId, roleName) values (0, 'user');
insert into ecommerce.roles (roleId, roleName) values (1, 'admin');
insert into ecommerce.roles (roleId, roleName) values (2, 'super-admin');

-- Accounts

insert into ecommerce.accounts (accountId, email, userName, password, roleId, isDeleted, createdDate, modifiedDate) values (1, 'khoa.buianh@gmail.com', 'khoa.buianh', 'admin', 2, 0, '2020-11-06 00:24:55', '2020-11-06 00:25:00');
insert into ecommerce.accounts (accountId, email, userName, password, roleId, isDeleted, createdDate, modifiedDate) values (2, 'hoang.nguyenduy@gmail.com', 'hoang.nguyenduy', 123, 1, 0, '2020-11-06 00:26:08', '2020-11-06 00:26:10');
insert into ecommerce.accounts (accountId, email, userName, password, roleId, isDeleted, createdDate, modifiedDate) values (3, 'tran.langthixuan@gmail.com', 'tran.langthixuan', 123, 1, 0, '2020-11-06 00:26:51', '2020-11-06 00:26:54');
insert into ecommerce.accounts (accountId, email, userName, password, roleId, isDeleted, createdDate, modifiedDate) values (4, 'tuan.doanh@gmail.com', 'tuan.doanh', 123, 1, 0, '2020-11-06 00:27:45', '2020-11-06 00:27:46');
insert into ecommerce.accounts (accountId, email, userName, password, roleId, isDeleted, createdDate, modifiedDate) values (5, 'hao.tranvannguyen@gmail.com', 'hao.tranvannguyen', 1, 0, 0, '2020-11-06 00:28:40', '2020-11-06 00:28:42');
insert into ecommerce.accounts (accountId, email, userName, password, roleId, isDeleted, createdDate, modifiedDate) values (6, 'hanh.tranxuan@gmail.com', 'hanh.tranxuan', 1, 0, 0, '2020-11-06 00:29:08', '2020-11-06 00:29:09');
insert into ecommerce.accounts (accountId, email, userName, password, roleId, isDeleted, createdDate, modifiedDate) values (7, 'dung.lelehanh@gmail.com', 'dung.lelehanh', 1, 0, 0, '2020-11-06 00:30:29', '2020-11-06 00:30:30');
insert into ecommerce.accounts (accountId, email, userName, password, roleId, isDeleted, createdDate, modifiedDate) values (8, 'nam.nguyenphuong@gmail.com', 'nam.nguyenphuong', 1, 0, 0, '2020-11-06 00:31:11', '2020-11-06 00:31:12');


-- Customer
-- This ALTER statement to help we can input Vietnamese as UTF-8 format
ALTER TABLE ecommerce.customers CONVERT TO CHARACTER SET utf8 COLLATE utf8_general_ci;

insert into ecommerce.customers (customerId, accountId, lastName, firstName, gender, phone, email, addressLine, ward, city, isDeleted, createdDate, modifiedDate) values (1, 5, 'Trần Văn Nguyên', 'Hảo', 'Male', 3588123123, 'hao.tranvannguyen@gmail.com', '1 Phan Xích Long', 'Phú Nhuận', 'HCM', 0, '2020-11-06 00:36:23', '2020-11-06 00:36:26');
insert into ecommerce.customers (customerId, accountId, lastName, firstName, gender, phone, email, addressLine, ward, city, isDeleted, createdDate, modifiedDate) values (2, 6, 'Trần Xuân', 'Hạnh', 'Male', 358844499, 'hanh.tranxuan@gmail.com', '800 CMT8', 'Tân Bình', 'HCM', 0, '2020-11-06 00:36:27', '2020-11-06 00:36:27');
insert into ecommerce.customers (customerId, accountId, lastName, firstName, gender, phone, email, addressLine, ward, city, isDeleted, createdDate, modifiedDate) values (3, 7, 'Lê Lê Hạnh', 'Dung', 'Female', 672148738, 'dung.lelehanh@gmail.com', '25 Phan Văn Trị', 'Gò Vấp', 'HCM', 0, '2020-11-06 00:36:28', '2020-11-06 00:36:28');
insert into ecommerce.customers (customerId, accountId, lastName, firstName, gender, phone, email, addressLine, ward, city, isDeleted, createdDate, modifiedDate) values (4, 8, 'Nguyễn Phương', 'Nam', 'Male', 486478928, 'nam.nguyenphuong@gmail.com', '10 Hoàng Hoa Thám', 'Tân Bình', 'HCM', 0, '2020-11-06 00:36:29', '2020-11-06 00:36:30');



-- Articles
-- This ALTER statement to help we can input Vietnamese as UTF-8 format
ALTER TABLE ecommerce.articles CONVERT TO CHARACTER SET utf8 COLLATE utf8_general_ci;


insert into ecommerce.articles (articleId, articleTitle, content, isDeleted, createdDate, modifiedDate, createdBy, modifiedBy) values (1, 'Chẳng cần đầu tư đồ đắt tiền, chỉ chút gel nha đam là đủ để bạn phục hồi cho tóc mềm mượt', 'Nếu bạn đang rầu rĩ vì mái tóc khô cằn, xơ xác sau hàng loạt trận uốn, nhuộm, tạo kiểu chơi Tết thì đây có thể là giải pháp ngon-bổ-rẻ nhất giúp bạn phục hồi lại mái tóc mây bồng bềnh.
Nói đến nha đam (lô hội), các tín đồ làm đẹp hẳn sẽ nghĩ ngay đến công dụng làm dịu da khi cháy nắng cũng như khả năng trị mụn đã được công nhận của loài cây này. Tuy nhiên, ít ai để ý rằng bên cạnh lợi ích tuyệt vời đối với làn da, nha đam còn là một chất dưỡng tóc tuyệt vời. Nếu bạn đang rầu rĩ vì mái tóc khô cằn, xơ xác sau hàng loạt trận uốn, nhuộm, tạo kiểu chơi Tết thì đây có thể là giải pháp ngon-bổ-rẻ nhất giúp bạn phục hồi lại mái tóc mây bồng bềnh.

Nha đam có tác dụng gì với mái tóc?

Tương tự như cách mà nha đam làm dịu và dưỡng ẩm cho da, nó cũng có khả năng phục hồi sức khỏe cho mái tóc nhờ vô số các thành phần có lợi như chất chống ôxy hóa, khoáng chất, acid béo và đặc biệt là lượng enzyme tự nhiên dồi dào. Những enzyme này có khả năng dưỡng ẩm hiệu quả cho cả tóc và da đầu, vừa giúp tóc khô xơ trở nên mềm mượt, bóng khỏe hơn lại vừa xoa dịu da đầu, khắc phục tình trạng ngứa ngáy do gầu hay kích ứng (vốn thường xảy ra vào mùa lạnh hoặc với những người thường xuyên tẩy tóc). Sơ sơ là khi dưỡng tóc với nha đam, bạn sẽ nhận lại được cả combo lợi ích: tóc mềm mượt, mọc nhanh hơn, hết gầu, hết ngứa.

Cách dùng nha đam để dưỡng tóc

Bạn có thể tìm mua những sản phẩm chăm sóc tóc chuyên nghiệp có chứa tinh chất nha đam nhưng cách đơn giản nhất chính là dùng lá nha đam tươi. Những gì bạn cần làm là tách phần "thạch" gel bên trong lá nha đam tươi, xay nhuyễn trong vài giây để có hỗn hợp sệt, vậy là đã có ngay gel dưỡng tóc nha đam nguyên chất rồi.

Gel nha đam vừa có thể dùng để gội đầu vừa có thể dùng như dầu xả. Để gội đầu, bạn pha chút ít gel vào dầu gội mình đang dùng, massage da đầu nhẹ nhàng. Sau khi đã gội sạch, bạn có thể dùng riêng gel nha đam như một loại dầu xả hoặc pha nó với loại dầu xả yêu thích của mình, thoa đều từ gốc đến ngọn tóc, để trong 30 phút rồi xả sạch.

Vì bản chất gel nha đam khá nhớt nên bạn hãy chú ý xả tóc thật kỹ để tránh trường hợp lượng nha đam dư thừa lưu lại làm nặng, bết tóc. Hãy kiên trì áp dụng liệu pháp DIY ngon-bổ-rẻ này với tần suất 2 lần/tuần và chỉ sau vài tuần, bạn sẽ thấy mái tóc của mình mềm mượt, bóng khỏe hơn hẳn đấy.', 0, '2020-11-06 00:41:13', '2020-11-06 00:41:12', 1, 1);
insert into ecommerce.articles (articleId, articleTitle, content, isDeleted, createdDate, modifiedDate, createdBy, modifiedBy) values (2, 'Rau xanh tăng giá mạnh vì trời mưa, người dân nội thành lao đao', 'Khoảng gần một tuần nay, do ảnh hưởng của những cơn mưa lớn kéo dài liên tiếp nên nguồn cung rau xanh cho các chợ bắt đầu khan hiếm, giá tăng mạnh, thậm chí nhiều loại giá tăng gần gấp đôi.

Khảo sát của người viết tại một số chợ đầu mối, chợ truyền thống trên địa bàn Hà Nội như chợ Đình Công, chợ Cầu Giấy, Phùng Khoang, chợ Hôm, Chợ Dịch Vọng, chợ Nhổn… giá các loại rau, củ đã tăng phổ biến 20 -30% so với 1-2 tuần trước.

Cụ thể, tại chợ Dịch Vọng, rau dền, mồng tơi giá 8.000 đồng/mớ, tăng 2.000 đồng/mớ; rau muống tăng 3000 đồng/mớ lên 10.000 đồng/mớ; rau ngót cũng tăng 1.000 đồng/mớ lên 7.000 đồng/mớ; cải xanh tăng từ 5.000 đồng lên 8.000 đồng/mớ; bắp cải tăng 3.000 đồng/kg lên 15.000 đồng/kg; cải thảo tăng 5.000 đồng/kg lên 16.000 đồng/kg, mướp đắng tăng 10.000 đồng/kg lên 16.000 đồng/kg. Hành lá tăng giá mạnh nhất lên 60.000/kg.

Một số loại củ quả như cà chua còn có giá tăng gấp đôi, từ 20.000 đồng/kg lên 40.000 đồng/kg, cà rốt có giá từ 25.000 – 30.000 đồng/kg; su hào 8.000 đồng /củ…so với trước đợt bão.

Chị Nguyễn Thị Thanh, tiểu thương bán rau ở chợ Dịch Vọng cho biết, giá rau củ tặng mạnh do thời tiết mưa to gây ngập úng khiến nguồn cung rau củ giảm. Bên cạnh đó, đây là thời điểm cuối mùa vụ của một số loại rau củ như các loại rau muống, mồng tơi, mướp ngọt…cũng khiến cho nguồn cung ứng rau thiếu hụt.

“Như hôm nay ra chợ đầu mối nhập rau mà mỗi loại chỉ nhập được 5-10kg, bán đến tầm 8 giờ sáng rau ở sạp đã gần hết. Đến chiều, tôi đang không biết lấy hàng đâu bán cho khách”, chị Thanh chia sẻ.

Tại nhiều vùng trồng rau ngoại thành Hà Nội như Vân Nội, Song Phương, Tây Tựu... do mưa lớn kéo dài nên rau ít nhiều bị ngập úng, hư hại.

Bà Trần Thị Mai, tại xã Tây Tựu –Từ Liêm chuyên trồng sản xuất rau xanh bán buôn cho các chợ đầu mối cho biết, nhà bà trồng 6 sào rau xanh đủ các nhưng mấy ngày gần đây do mưa to ảnh hưởng nên làm cho rau trong vườn phát triển chậm và dập nát hết các luống rau mới gieo trồng.', 0, '2020-11-06 00:56:14', '2020-11-06 00:56:16', 2, 2);
insert into ecommerce.articles (articleId, articleTitle, content, isDeleted, createdDate, modifiedDate, createdBy, modifiedBy) values (3, 'Hạt chia rất tốt cho sức khỏe, nhất là ở 7 lợi ích trên cả tuyệt vời này', 'Không chỉ là nguồn dinh dưỡng tuyệt vời mà hạt chia còn giúp cải thiện sức khỏe tốt hơn rất nhiều.

Hạt chia được các chuyên gia xem như một nguồn dinh dưỡng dồi dào cho sức khỏe. Cứ 28gr hạt chia có thể chứa 11gr chất xơ, 4gr protein, 9gr chất béo và trong đó phần lớn là Omega 3. Đặc biệt, trong hạt chia còn có 18% canxi, 30% mangan, 30% magie, 27% phốt pho cùng một lượng không ít kẽm, vitamin B3 (Niacin), kali, vitamin B1 (Thiamine) và vitamin B2. Với hàm lượng dinh dưỡng cao, hãy cùng tìm hiểu các lợi ích của hạt chia ngay bây giờ nhé.

Cải thiện chức năng tiêu hóa
Hạt chia rất giàu chất xơ và chính hàm lượng chất xơ cao này sẽ tác động khá nhiều vào hệ tiêu hóa, giảm kích ứng ruột, thúc đẩy nhu động ruột thuận lợi hơn nên chức năng tiêu hóa cũng được cải thiện đáng kể. Ngoài ra, hạt chia còn giúp kích thích sản sinh vi khuẩn có lợi trong đường tiêu hóa, từ đó hệ tiêu hóa của bạn sẽ khỏe mạnh hơn rất nhiều.

Giải độc cơ thể
Vì hạt chia có tác dụng cải thiện sức khỏe hệ tiêu hóa nên đây cũng là nguồn giúp loại bỏ chất độc trong cơ thể một cách tự nhiên. Ngoài ra, hợp chất chống viêm có trong hạt chia cũng giúp ngăn ngừa và phục hồi các tế bào bị tổn thương. Từ đó, các tế bào ít bị hư hỏng trong khi lượng độc tố từ cơ thể lại được thải ra ngoài hiệu quả nên chắc chắn sức khỏe tổng thể sẽ được nâng cao đáng kể.

Giúp giảm cân hiệu quả
Hạt chia là nguồn thực phẩm rất giàu chất xơ, giúp lấp đầy dạ dày nhanh chóng nên bạn sẽ lâu đói cũng như giảm tiêu thụ thực phẩm vào cơ thể. Ngoài ra, trong hạt chia cũng giàu đạm thực vật. Đây là nguồn đạm cực tốt cho sức khỏe lẫn cân nặng bởi khả năng giúp nhanh no và hạn chế thèm ăn hiệu quả.


Nguồn cung cấp chất chống oxy hoá tuyệt vời

Hạt chia từ lâu đã được công nhận là nguồn chất chống oxy hóa rất lý tưởng cho cơ thể. Chính lượng chất chống oxy hóa dồi dào này sẽ giúp chống lại sự hình thành các gốc tự do gây hại cho tế bào. Một khi các gốc tự do gây hại bị ngăn chặn thì quá trình lão hóa sẽ bị hạn chế, đồng thời ngăn ngừa nhiều bệnh nguy hiểm, trong đó có cả ung thư.

Xương chắc khỏe hơn
Hạt chia là nguồn canxi tuyệt vời cho sức khỏe xương, có thể sánh ngang với sữa. Đặc biệt, trong loại hạt nhỏ bé này còn có chứa nhiều hợp chất giúp cơ thể hấp thụ vitamin D tốt hơn. Vitamin D là dưỡng chất rất cần thiết cho cơ thể tổng hợp canxi. Do đó, tiêu thụ thường xuyên hạt chia là cách tuyệt vời để cải thiện sức khỏe xương.', 0, '2020-11-06 01:00:42', '2020-11-06 01:00:44', 1, 1);



-- Categories
ALTER TABLE ecommerce.categories CONVERT TO CHARACTER SET utf8 COLLATE utf8_general_ci;
insert into ecommerce.categories (categoryId, categoryName, description, categoryImage, isDeleted, createdDate, modifiedDate, createdBy, modifiedBy) values (1, 'Đồ uống', 'Đồ uống giúp cho việc giải khát nhanh chóng, và phục hồi năng lượng để làm việc', null, 0, '2020-11-06 01:12:15', '2020-11-06 01:12:16', 3, 3);
insert into ecommerce.categories (categoryId, categoryName, description, categoryImage, isDeleted, createdDate, modifiedDate, createdBy, modifiedBy) values (2, 'Đặc sản Huế', 'Cùng thưởng thức những món ăn vặt nổi tiếng của xứ Huế', null, 0, '2020-11-06 01:13:22', '2020-11-06 01:13:23', 3, 3);
insert into ecommerce.categories (categoryId, categoryName, description, categoryImage, isDeleted, createdDate, modifiedDate, createdBy, modifiedBy) values (3, 'Trái cây', 'Bổ sung năng lượng, nhâm nhi nhẹ nhàng sau giờ làm việc căng thẳng', null, 0, '2020-11-06 01:23:55', '2020-11-06 01:23:57', 2, 2);
insert into ecommerce.categories (categoryId, categoryName, description, categoryImage, isDeleted, createdDate, modifiedDate, createdBy, modifiedBy) values (4, 'Đồ ăn nhanh', 'Nạp năng lượng nhanh chóng', null, 0, '2020-11-06 01:25:03', '2020-11-06 01:25:06', 4, 4);




-- Products
ALTER TABLE ecommerce.products CONVERT TO CHARACTER SET utf8 COLLATE utf8_general_ci;

insert into ecommerce.products (productId, productName, category, productDescription, quantityInStock, buyPrice, productImage, discount, viewCount, isDeleted, createdDate, modifiedDate, createdBy, modifiedBy) values (1, 'Cơm cháy chà bông', 4, 'Cơm cháy ở đây ngon tuyệt', 120, 80000, null, 0, 0, 0, '2020-11-06 01:38:25', '2020-11-06 01:38:29', 2, 2);
insert into ecommerce.products (productId, productName, category, productDescription, quantityInStock, buyPrice, productImage, discount, viewCount, isDeleted, createdDate, modifiedDate, createdBy, modifiedBy) values (2, 'Bánh lọc Huế', 2, 'Bánh bột lọc là thức ăn vặt quen thuộc của người Việt Nam. Tuy nhiên, ngon nhất phải kể đến bánh bột lọc gói lá chuối của người Huế.', 400, 5500, null, 0, 0, 0, '2020-11-06 01:44:10', '2020-11-06 01:44:13', 3, 3);
insert into ecommerce.products (productId, productName, category, productDescription, quantityInStock, buyPrice, productImage, discount, viewCount, isDeleted, createdDate, modifiedDate, createdBy, modifiedBy) values (3, 'Nước nha đam', 1, 'Lô hội , hay Nha đam , Long tu (có nơi gọi là lưu hội, long thủ...) là tên gọi các loài cây mọng nước thuộc chi Lô hội (phát âm / ˈ æ l oʊ iː / hay / ˈ æ l oʊ / ) . ', 34, 12000, null, 0, 0, 0, '2020-11-06 01:45:37', '2020-11-06 01:45:39', 3, 3);
insert into ecommerce.products (productId, productName, category, productDescription, quantityInStock, buyPrice, productImage, discount, viewCount, isDeleted, createdDate, modifiedDate, createdBy, modifiedBy) values (4, 'Xoài, táo', 3, 'Xoài Táo Kampuchea', 100, 40000, null, 0, 0, 0, '2020-11-06 01:47:05', '2020-11-06 01:47:08', 4, 4);
insert into ecommerce.products (productId, productName, category, productDescription, quantityInStock, buyPrice, productImage, discount, viewCount, isDeleted, createdDate, modifiedDate, createdBy, modifiedBy) values (5, 'Cơm cháy chà bông', 4, 'Cơm cháy ở đây ngon tuyệt', 120, 80000, null, 0, 0, 0, '2020-11-06 01:38:25', '2020-11-06 01:38:29', 2, 2);
insert into ecommerce.products (productId, productName, category, productDescription, quantityInStock, buyPrice, productImage, discount, viewCount, isDeleted, createdDate, modifiedDate, createdBy, modifiedBy) values (6, 'Bánh lọc Huế', 2, 'Bánh bột lọc là thức ăn vặt quen thuộc của người Việt Nam. Tuy nhiên, ngon nhất phải kể đến bánh bột lọc gói lá chuối của người Huế.', 400, 5500, null, 0, 0, 0, '2020-11-06 01:44:10', '2020-11-06 01:44:13', 3, 3);
insert into ecommerce.products (productId, productName, category, productDescription, quantityInStock, buyPrice, productImage, discount, viewCount, isDeleted, createdDate, modifiedDate, createdBy, modifiedBy) values (7, 'Nước nha đam', 1, 'Lô hội , hay Nha đam , Long tu (có nơi gọi là lưu hội, long thủ...) là tên gọi các loài cây mọng nước thuộc chi Lô hội (phát âm / ˈ æ l oʊ iː / hay / ˈ æ l oʊ / ) . ', 34, 12000, null, 0, 0, 0, '2020-11-06 01:45:37', '2020-11-06 01:45:39', 3, 3);
insert into ecommerce.products (productId, productName, category, productDescription, quantityInStock, buyPrice, productImage, discount, viewCount, isDeleted, createdDate, modifiedDate, createdBy, modifiedBy) values (8, 'Xoài, táo', 3, 'Xoài Táo Kampuchea', 100, 40000, null, 0, 0, 0, '2020-11-06 01:47:05', '2020-11-06 01:47:08', 4, 4);
insert into ecommerce.products (productId, productName, category, productDescription, quantityInStock, buyPrice, productImage, discount, viewCount, isDeleted, createdDate, modifiedDate, createdBy, modifiedBy) values (9, 'Cơm cháy chà bông', 4, 'Cơm cháy ở đây ngon tuyệt', 120, 80000, null, 0, 0, 0, '2020-11-06 01:38:25', '2020-11-06 01:38:29', 2, 2);
insert into ecommerce.products (productId, productName, category, productDescription, quantityInStock, buyPrice, productImage, discount, viewCount, isDeleted, createdDate, modifiedDate, createdBy, modifiedBy) values (10, 'Bánh lọc Huế', 2, 'Bánh bột lọc là thức ăn vặt quen thuộc của người Việt Nam. Tuy nhiên, ngon nhất phải kể đến bánh bột lọc gói lá chuối của người Huế.', 400, 5500, null, 0, 0, 0, '2020-11-06 01:44:10', '2020-11-06 01:44:13', 3, 3);
insert into ecommerce.products (productId, productName, category, productDescription, quantityInStock, buyPrice, productImage, discount, viewCount, isDeleted, createdDate, modifiedDate, createdBy, modifiedBy) values (11, 'Nước nha đam', 1, 'Lô hội , hay Nha đam , Long tu (có nơi gọi là lưu hội, long thủ...) là tên gọi các loài cây mọng nước thuộc chi Lô hội (phát âm / ˈ æ l oʊ iː / hay / ˈ æ l oʊ / ) . ', 34, 12000, null, 0, 0, 0, '2020-11-06 01:45:37', '2020-11-06 01:45:39', 3, 3);
insert into ecommerce.products (productId, productName, category, productDescription, quantityInStock, buyPrice, productImage, discount, viewCount, isDeleted, createdDate, modifiedDate, createdBy, modifiedBy) values (12, 'Xoài, táo', 3, 'Xoài Táo Kampuchea', 100, 40000, null, 0, 0, 0, '2020-11-06 01:47:05', '2020-11-06 01:47:08', 4, 4);

-- Shopping carts

insert into ecommerce.shoppingcarts (customerId, productId, quantity, createdDate, modifiedDate, status) values (1, 1, 5, '2020-11-06 08:30:01', '2020-11-06 08:30:03', 'active');
insert into ecommerce.shoppingcarts (customerId, productId, quantity, createdDate, modifiedDate, status) values (1, 2, 50, '2020-11-06 08:28:06', '2020-11-06 08:28:08', 'active');
insert into ecommerce.shoppingcarts (customerId, productId, quantity, createdDate, modifiedDate, status) values (2, 2, 10, '2020-11-06 08:30:48', '2020-11-06 08:30:51', 'active');
insert into ecommerce.shoppingcarts (customerId, productId, quantity, createdDate, modifiedDate, status) values (3, 3, 3, '2020-11-06 08:30:20', '2020-11-06 08:30:22', 'active');




-- Payments

insert into ecommerce.payments (paymentId, customerId, paymentDate, amount, paymentMethods, createdDate) values (1, 1, '2020-11-06', 675000, 'Ship COD', '2020-11-06 08:44:53');
insert into ecommerce.payments (paymentId, customerId, paymentDate, amount, paymentMethods, createdDate) values (2, 2, '2020-11-06', 36000, 'Ship COD', '2020-11-06 08:47:24');
insert into ecommerce.payments (paymentId, customerId, paymentDate, amount, paymentMethods, createdDate) values (3, 3, '2020-11-06', 55000, 'Ship COD', '2020-11-06 08:47:40');




-- Orders

insert into ecommerce.orders (orderNumber, paymentId, orderedQuantity, createdDate, status) values (1, 1, 675000, '2020-11-06 08:42:19', 'shipping');
insert into ecommerce.orders (orderNumber, paymentId, orderedQuantity, createdDate, status) values (2, 3, 36000, '2020-11-06 08:44:43', 'received');
insert into ecommerce.orders (orderNumber, paymentId, orderedQuantity, createdDate, status) values (3, 2, 55000, '2020-11-06 08:45:00', 'received');



-- OrderDetails

insert into ecommerce.orderDetails (orderId, productId, orderQuantity, createdDate) values (1, 1, 5, '2020-11-06 08:40:25');
insert into ecommerce.orderDetails (orderId, productId, orderQuantity, createdDate) values (1, 2, 50, '2020-11-06 08:40:49');
insert into ecommerce.orderDetails (orderId, productId, orderQuantity, createdDate) values (2, 3, 3, '2020-11-06 08:41:17');
insert into ecommerce.orderDetails (orderId, productId, orderQuantity, createdDate) values (3, 2, 10, '2020-11-06 08:42:48');


-- Comments

SET FOREIGN_KEY_CHECKS=0;
ALTER TABLE ecommerce.comments CONVERT TO CHARACTER SET utf8 COLLATE utf8_general_ci;
SET FOREIGN_KEY_CHECKS=1;

insert into ecommerce.comments (commentId, email, articleId, commentContent, createAt, modifiedAt) values (1, 'dung.lelehanh@gmail.com',  2, 'Rau má rất mát, rất tốt cho sức khỏe', '2020-11-10 22:29:11', '2020-11-10 22:29:14');
insert into ecommerce.comments (commentId, email, articleId, commentContent, createAt, modifiedAt) values (2, 'nam.nguyenphuong@gmail.com',  1, 'Hạt chia là sản phẩm khá mới lạ, từ ngày biết đến hạt chia, tôi không còn uống trà sữa nữa', '2020-11-10 22:43:15', '2020-11-10 22:43:16');
insert into ecommerce.comments (commentId, email, articleId, commentContent, createAt, modifiedAt) values (3, 'hanh.tranxuan@gmail.com', 3,  'Chưa bao giờ tôi ăn một phần cơm cháy ngon như thế này', '2020-11-10 22:46:36', '2020-11-10 22:46:38');
insert into ecommerce.comments (commentId, email, articleId, commentContent, createAt, modifiedAt) values (4, 'dung.lelehanh@gmail.com',  2, 'Rau má rất mát, rất tốt cho sức khỏe', '2020-11-10 22:29:11', '2020-11-10 22:29:14');
insert into ecommerce.comments (commentId, email, articleId, commentContent, createAt, modifiedAt) values (5, 'nam.nguyenphuong@gmail.com',  1, 'Hạt chia là sản phẩm khá mới lạ, từ ngày biết đến hạt chia, tôi không còn uống trà sữa nữa', '2020-11-10 22:43:15', '2020-11-10 22:43:16');
insert into ecommerce.comments (commentId, email, articleId, commentContent, createAt, modifiedAt) values (6, 'hanh.tranxuan@gmail.com', 3,  'Chưa bao giờ tôi ăn một phần cơm cháy ngon như thế này', '2020-11-10 22:46:36', '2020-11-10 22:46:38');

SET FOREIGN_KEY_CHECKS=0;
ALTER TABLE ecommerce.productReviews CONVERT TO CHARACTER SET utf8 COLLATE utf8_general_ci;
SET FOREIGN_KEY_CHECKS=1;
insert into ecommerce.productReviews (reviewId, productId, content, isDeleted, createdDate, modifiedDate, createdBy, modifiedBy) values (1, 1,  'hello', false , '2020-11-10 22:29:11', '2020-11-10 22:29:14', 1, 1);
insert into ecommerce.productReviews (reviewId, productId, content, isDeleted, createdDate, modifiedDate, createdBy, modifiedBy) values (2, 2,  'hello1', false , '2020-11-10 22:29:11', '2020-11-10 22:29:14', 2, 2);
insert into ecommerce.productReviews (reviewId, productId, content, isDeleted, createdDate, modifiedDate, createdBy, modifiedBy) values (3, 1,  'hello3', false , '2020-11-10 22:29:11', '2020-11-10 22:29:14', 1, 1);
insert into ecommerce.productReviews (reviewId, productId, content, isDeleted, createdDate, modifiedDate, createdBy, modifiedBy) values (4, 3,  'hello3', false , '2020-11-10 22:29:11', '2020-11-10 22:29:14', 3, 3);
