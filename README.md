# 1. Git là gì?
***Git*** là một hệ thống quản lý phiên bản phân tán (*Distributed Version Control System – DVCS*), nó là một trong những hệ thống quản lý phiên bản phân tán phổ biến nhất hiện nay. Git cung cấp cho mỗi lập trình viên kho lưu trữ (_repository_) riêng chứa toàn bộ lịch sử thay đổi.
# 2. Các thuật ngữ Git quan trọng 
## 2.1 Branch
- Các Branch (nhánh) đại diện cho các phiên bản cụ thể của một kho lưu trữ tách ra từ project chính của bạn.
- Branch cho phép bạn theo dõi các thay đổi thử nghiệm bạn thực hiện đối với kho lưu trữ và có thể hoàn nguyên về các phiên bản cũ hơn.
## 2.2 Commit
Một commit đại diện cho một thời điểm cụ thể trong lịch sử dự án của bạn. Sử dụng lệnh commit kết hợp với lệnh `git add` để cho git biết những thay đổi bạn muốn lưu vào local repository.
## 2.3 Head
Các commit ở đầu của một branch được gọi là head. Nó đại diện cho commit mới nhất của repository mà bạn hiện đang làm việc.
## 2.4 Master
- Master là nhánh chính của tất cả các repository của bạn. Nó nên bao gồm những thay đổi và commit gần đây nhất.
- Đối với `github` nhánh chính là `main`
## 2.5 Origin
Origin là phiên bản mặc định của repository. Origin cũng đóng vai trò là bí danh hệ thống để liên lạc với nhánh chính.

Lệnh `git push origin master` để đẩy các thay đổi cục bộ đến nhánh chính.
## 2.6 Remote
Một Remote (kho lưu trữ từ xa) là một bản sao của một chi nhánh. Remote giao tiếp ngược dòng với nhánh gốc (origin branch) của chúng và các Remote khác trong kho lưu trữ.
## 2.7 Repository
Kho lưu trữ Git chứa tất cả các tệp dự án của bạn bao gồm các branch, tags và commit.
## 2.8 Tags
Tags cung cấp cho bạn một cách để theo dõi các commit quan trọng. Các tags nhẹ chỉ đơn giản đóng vai trò là con trỏ trong khi các tags chú thích được lưu trữ dưới dạng các đối tượng đầy đủ.
# 3. Cách sử dụng cơ bản
## 3.1 Tạo kho lưu trữ (Repository) mới
Để làm việc với Git, trước tiên bạn cần cho nó biết bạn là ai. Bạn có thể đặt tên người dùng của mình bằng lệnh `git config`:
```
git config --global user.name "your name goes here"
```
Khi nó được khởi động, bạn sẽ cần một **repo** để làm việc. Việc tạo một **repo** rất đơn giản. Sử dụng lệnh `git init` trong một thư mục:
```
mkdir example
cd example
git init
```
Kiểm tra trạng thái
```
git status
```
Lệnh này sẽ cho bạn biết bạn đang ở `branch` nào, những file thay đổi chưa được commit
## 3.2 Thêm file mới
Tạo mới một file, ví dụ `hello.py`. Sau đó kiểm tra trạng thái bằng lệnh
```
git status
On branch master

Initial commit

Untracked files:
  (use "git add <file>..." to include in what will be committed)

   hello.py

nothing added to commit but untracked files present (use "git add" to track)
```
Sử dung lệnh `git add` để thêm nó cào stage changes
```
git add ./hello.py
```
## 3.3 Ghi nhận thay đổi
```
git commit -m "creating hello.py"
[master (root-commit) 25b09b9] creating hello.py
 1 file changed, 3 insertions(+)
 create mode 100755 hello.py

git status
On branch master
nothing to commit, working directory clean
```
# 4. Làm việc với kho lưu trữ trên remote
## 4.1 Clone
Sao chép một kho lưu trữ trên `remote` về `local`
```
git clone https://link/to/repo

```
## 4.2 Fetch
Tìm nạp các bản sao và tải xuống tất cả các tệp branch vào máy tính của bạn. Sử dụng nó để lưu các thay đổi mới nhất vào kho lưu trữ của bạn. Nó có thể tìm nạp nhiều branch cùng một lúc.
```
git fetch
```
## 4.3 Đẩy thay đổi lên `remote`
```
git push
```
## 4.4 Kéo những thay đổi từ `remote` về
```
git pull
```
## 4.5 Branch
Xem các branch hiện có
```
git branch # Các branch trên local
git branch -r # Các branch trên remote
git branch -a # Các branch ở cả local và remote
```
Chuyển branch
```
git checkout <tên nhánh>
```
Tạo và chuyển sang branch mới
```
git checkout -b <tên nhánh>
```
Chuyển branch trên `remote`
```
git fetch --all # Tìm nạp nội dung của các nhánh
git checkout <tên nhánh>
```

