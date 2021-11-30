USE [QuanLySinhVien]
GO
/****** Object:  Table [dbo].[ChuyenNganh]    Script Date: 11/30/2021 12:09:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChuyenNganh](
	[MaChuyenNganh] [varchar](20) NOT NULL,
	[TenChuyenNganh] [nvarchar](70) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaChuyenNganh] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[DIEM]    Script Date: 11/30/2021 12:09:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DIEM](
	[MaDiem] [int] IDENTITY(1,1) NOT NULL,
	[DiemLab1] [float] NULL,
	[DiemLab2] [float] NULL,
	[DiemLab3] [float] NULL,
	[DiemLab4] [float] NULL,
	[DiemLab5] [float] NULL,
	[DiemLab6] [float] NULL,
	[DiemLab7] [float] NULL,
	[DiemLab8] [float] NULL,
	[DiemAssgnmentGD1] [float] NULL,
	[DiemAssgnmentGD2] [float] NULL,
	[DiemDoc] [float] NULL,
	[MaSV] [varchar](7) NOT NULL,
	[MaMH] [varchar](7) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaDiem] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 11/30/2021 12:09:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[MaHoaDon] [int] IDENTITY(1,1) NOT NULL,
	[SoHoaDon] [varchar](15) NOT NULL,
	[NgayTaoHD] [date] NOT NULL,
	[MaNhanVien] [varchar](7) NOT NULL,
	[MaSinhVien] [varchar](7) NOT NULL,
	[MaChuyenNganhSV] [varchar](20) NOT NULL,
	[HocPhi] [money] NOT NULL,
	[TinhTrang] [bit] NULL,
	[TongTien] [money] NULL,
	[HocKy] [varchar](10) NULL,
 CONSTRAINT [PK_HoaDon] PRIMARY KEY CLUSTERED 
(
	[MaHoaDon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HocKy]    Script Date: 11/30/2021 12:09:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HocKy](
	[MaHocKy] [varchar](10) NOT NULL,
	[TenHocKy] [varchar](15) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaHocKy] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LichHoc]    Script Date: 11/30/2021 12:09:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LichHoc](
	[MaLichHoc] [int] IDENTITY(1,1) NOT NULL,
	[Ngay] [date] NULL,
	[ThoiGian] [nvarchar](50) NULL,
	[MaMonHoc] [varchar](7) NOT NULL,
	[MaLopHoc] [varchar](9) NOT NULL,
	[MaChuyenNganh] [varchar](20) NOT NULL,
	[MaNhanVien] [varchar](7) NOT NULL,
	[MaPhongHoc] [varchar](20) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaLichHoc] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LopHoc]    Script Date: 11/30/2021 12:09:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LopHoc](
	[MaLopHoc] [varchar](9) NOT NULL,
	[TenLopHoc] [nvarchar](50) NOT NULL,
	[MaNhanVien] [varchar](7) NOT NULL,
	[NgayDangKy] [date] NULL,
	[MaChuyenNganh] [varchar](20) NOT NULL,
	[TrangThai] [bit] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaLopHoc] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[MonHoc]    Script Date: 11/30/2021 12:09:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[MonHoc](
	[MaMonHoc] [varchar](7) NOT NULL,
	[TenMonHoc] [nvarchar](50) NULL,
	[NgayBatDau] [date] NULL,
	[NgayKetThuc] [date] NOT NULL,
	[MaChuyenNganh] [varchar](20) NOT NULL,
	[MaNhanVien] [varchar](7) NOT NULL,
	[HocPhi] [real] NOT NULL,
	[HocKy] [varchar](10) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[MaMonHoc] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 11/30/2021 12:09:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[MaNhanVien] [varchar](7) NOT NULL,
	[TenNhanVien] [nvarchar](50) NOT NULL,
	[SDT] [varchar](15) NOT NULL,
	[Email] [varchar](30) NOT NULL,
	[DiaChi] [nvarchar](50) NOT NULL,
	[NgaySinh] [date] NOT NULL,
	[GioiTinh] [bit] NOT NULL,
	[MaChuyenNganh] [varchar](20) NOT NULL,
	[Hinh] [varchar](20) NULL,
	[MaTaiKhoan] [varchar](7) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaNhanVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SinhVien]    Script Date: 11/30/2021 12:09:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SinhVien](
	[MaSinhVien] [varchar](7) NOT NULL,
	[TenSinhVien] [nvarchar](50) NOT NULL,
	[NgaySinh] [date] NOT NULL,
	[Email] [varchar](30) NOT NULL,
	[SDT] [varchar](12) NOT NULL,
	[DiaChi] [nvarchar](100) NOT NULL,
	[GioiTinh] [bit] NOT NULL,
	[MaChuyenNganh] [varchar](20) NOT NULL,
	[MaLopHoc] [varchar](9) NOT NULL,
	[Hinh] [varchar](20) NULL,
	[MaTaiKhoan] [varchar](7) NULL,
PRIMARY KEY CLUSTERED 
(
	[MaSinhVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 11/30/2021 12:09:18 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[MaTaiKhoan] [varchar](7) NOT NULL,
	[TenDangNhap] [varchar](50) NOT NULL,
	[MatKhau] [varchar](50) NOT NULL,
	[VaiTro] [int] NOT NULL,
 CONSTRAINT [PK_TaiKhoan] PRIMARY KEY CLUSTERED 
(
	[MaTaiKhoan] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[ChuyenNganh] ([MaChuyenNganh], [TenChuyenNganh]) VALUES (N'CKDT-TDH', N'Cơ khí, (điện) tự động hoá')
INSERT [dbo].[ChuyenNganh] ([MaChuyenNganh], [TenChuyenNganh]) VALUES (N'DL-NH-KS', N'Du lịch - Nhà hàng - Khách sạn')
INSERT [dbo].[ChuyenNganh] ([MaChuyenNganh], [TenChuyenNganh]) VALUES (N'IT-LT', N'Công nghệ thông tin')
INSERT [dbo].[ChuyenNganh] ([MaChuyenNganh], [TenChuyenNganh]) VALUES (N'KT-KD', N'Kinh tế - Kinh doanh')
INSERT [dbo].[ChuyenNganh] ([MaChuyenNganh], [TenChuyenNganh]) VALUES (N'TKDH', N'Thiết Kế Đồ Họa')
INSERT [dbo].[ChuyenNganh] ([MaChuyenNganh], [TenChuyenNganh]) VALUES (N'TMLD', N'Thẩm mỹ làm đẹp')
GO
SET IDENTITY_INSERT [dbo].[DIEM] ON 

INSERT [dbo].[DIEM] ([MaDiem], [DiemLab1], [DiemLab2], [DiemLab3], [DiemLab4], [DiemLab5], [DiemLab6], [DiemLab7], [DiemLab8], [DiemAssgnmentGD1], [DiemAssgnmentGD2], [DiemDoc], [MaSV], [MaMH]) VALUES (1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, N'PP11122', N'MOB1014')
INSERT [dbo].[DIEM] ([MaDiem], [DiemLab1], [DiemLab2], [DiemLab3], [DiemLab4], [DiemLab5], [DiemLab6], [DiemLab7], [DiemLab8], [DiemAssgnmentGD1], [DiemAssgnmentGD2], [DiemDoc], [MaSV], [MaMH]) VALUES (2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, N'Ph04328', N'MOB1014')
INSERT [dbo].[DIEM] ([MaDiem], [DiemLab1], [DiemLab2], [DiemLab3], [DiemLab4], [DiemLab5], [DiemLab6], [DiemLab7], [DiemLab8], [DiemAssgnmentGD1], [DiemAssgnmentGD2], [DiemDoc], [MaSV], [MaMH]) VALUES (3, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, N'PD04328', N'MOB1014')
INSERT [dbo].[DIEM] ([MaDiem], [DiemLab1], [DiemLab2], [DiemLab3], [DiemLab4], [DiemLab5], [DiemLab6], [DiemLab7], [DiemLab8], [DiemAssgnmentGD1], [DiemAssgnmentGD2], [DiemDoc], [MaSV], [MaMH]) VALUES (4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, N'PD04328', N'SOF102')
SET IDENTITY_INSERT [dbo].[DIEM] OFF
GO
SET IDENTITY_INSERT [dbo].[HoaDon] ON 

INSERT [dbo].[HoaDon] ([MaHoaDon], [SoHoaDon], [NgayTaoHD], [MaNhanVien], [MaSinhVien], [MaChuyenNganhSV], [HocPhi], [TinhTrang], [TongTien], [HocKy]) VALUES (3, N'', CAST(N'2021-11-27' AS Date), N'NV00001', N'PD04328', N'IT-LT', 300000.0000, 0, 300000.0000, N'FALL2021 ')
INSERT [dbo].[HoaDon] ([MaHoaDon], [SoHoaDon], [NgayTaoHD], [MaNhanVien], [MaSinhVien], [MaChuyenNganhSV], [HocPhi], [TinhTrang], [TongTien], [HocKy]) VALUES (4, N'', CAST(N'2021-11-27' AS Date), N'NV00001', N'PD04328', N'IT-LT', 19300000.0000, 0, 19300000.0000, N'FALL2021')
INSERT [dbo].[HoaDon] ([MaHoaDon], [SoHoaDon], [NgayTaoHD], [MaNhanVien], [MaSinhVien], [MaChuyenNganhSV], [HocPhi], [TinhTrang], [TongTien], [HocKy]) VALUES (5, N'', CAST(N'2021-11-27' AS Date), N'NV00001', N'PD04328', N'IT-LT', 19300000.0000, 0, 19300000.0000, N'FALL2021')
SET IDENTITY_INSERT [dbo].[HoaDon] OFF
GO
INSERT [dbo].[HocKy] ([MaHocKy], [TenHocKy]) VALUES (N'FALL2021', N'FALL 2021')
GO
SET IDENTITY_INSERT [dbo].[LichHoc] ON 

INSERT [dbo].[LichHoc] ([MaLichHoc], [Ngay], [ThoiGian], [MaMonHoc], [MaLopHoc], [MaChuyenNganh], [MaNhanVien], [MaPhongHoc]) VALUES (1, CAST(N'2021-11-01' AS Date), N'th', N'MOB1014', N'F101', N'IT-LT', N'NV00001', N'K403')
INSERT [dbo].[LichHoc] ([MaLichHoc], [Ngay], [ThoiGian], [MaMonHoc], [MaLopHoc], [MaChuyenNganh], [MaNhanVien], [MaPhongHoc]) VALUES (2, CAST(N'2021-11-27' AS Date), N'Thứ 7 Ngày 27 Tháng 11 Năm 2021', N'MOB1014', N'IT17309', N'IT-LT', N'NV00001', N'K403')
SET IDENTITY_INSERT [dbo].[LichHoc] OFF
GO
INSERT [dbo].[LopHoc] ([MaLopHoc], [TenLopHoc], [MaNhanVien], [NgayDangKy], [MaChuyenNganh], [TrangThai]) VALUES (N'F101', N'IT16317_3', N'NV00001', CAST(N'2020-10-02' AS Date), N'IT-LT', 1)
INSERT [dbo].[LopHoc] ([MaLopHoc], [TenLopHoc], [MaNhanVien], [NgayDangKy], [MaChuyenNganh], [TrangThai]) VALUES (N'IT16302', N'IT16302', N'NV00002', CAST(N'2020-12-08' AS Date), N'IT-LT', 1)
INSERT [dbo].[LopHoc] ([MaLopHoc], [TenLopHoc], [MaNhanVien], [NgayDangKy], [MaChuyenNganh], [TrangThai]) VALUES (N'IT16303', N'IT16303', N'NV00005', CAST(N'2020-09-03' AS Date), N'IT-LT', 1)
INSERT [dbo].[LopHoc] ([MaLopHoc], [TenLopHoc], [MaNhanVien], [NgayDangKy], [MaChuyenNganh], [TrangThai]) VALUES (N'IT17306', N'IT17306', N'NV00002', CAST(N'2020-09-28' AS Date), N'IT-LT', 1)
INSERT [dbo].[LopHoc] ([MaLopHoc], [TenLopHoc], [MaNhanVien], [NgayDangKy], [MaChuyenNganh], [TrangThai]) VALUES (N'IT17307', N'IT17307', N'NV00004', CAST(N'2020-09-02' AS Date), N'IT-LT', 1)
INSERT [dbo].[LopHoc] ([MaLopHoc], [TenLopHoc], [MaNhanVien], [NgayDangKy], [MaChuyenNganh], [TrangThai]) VALUES (N'IT17308', N'IT17308', N'NV00005', CAST(N'2020-09-12' AS Date), N'IT-LT', 1)
INSERT [dbo].[LopHoc] ([MaLopHoc], [TenLopHoc], [MaNhanVien], [NgayDangKy], [MaChuyenNganh], [TrangThai]) VALUES (N'IT17309', N'IT17309', N'NV00005', CAST(N'2020-05-22' AS Date), N'KT-KD', 1)
INSERT [dbo].[LopHoc] ([MaLopHoc], [TenLopHoc], [MaNhanVien], [NgayDangKy], [MaChuyenNganh], [TrangThai]) VALUES (N'IT17314', N'IT17314', N'NV00002', CAST(N'2020-09-17' AS Date), N'KT-KD', 1)
INSERT [dbo].[LopHoc] ([MaLopHoc], [TenLopHoc], [MaNhanVien], [NgayDangKy], [MaChuyenNganh], [TrangThai]) VALUES (N'IT17315', N'IT17315', N'NV00004', CAST(N'2020-08-24' AS Date), N'TKDH', 1)
INSERT [dbo].[LopHoc] ([MaLopHoc], [TenLopHoc], [MaNhanVien], [NgayDangKy], [MaChuyenNganh], [TrangThai]) VALUES (N'IT17316', N'IT17316', N'NV00004', CAST(N'2020-09-12' AS Date), N'TKDH', 1)
INSERT [dbo].[LopHoc] ([MaLopHoc], [TenLopHoc], [MaNhanVien], [NgayDangKy], [MaChuyenNganh], [TrangThai]) VALUES (N'TKDH01', N'DH1023', N'TEONV', CAST(N'2021-06-11' AS Date), N'TKDH', 1)
GO
INSERT [dbo].[MonHoc] ([MaMonHoc], [TenMonHoc], [NgayBatDau], [NgayKetThuc], [MaChuyenNganh], [MaNhanVien], [HocPhi], [HocKy]) VALUES (N'MOB1014', N'Nhập Môn Mobile', CAST(N'2021-01-01' AS Date), CAST(N'2021-02-01' AS Date), N'IT-LT', N'TEONV', 1000000, N'FALL2021')
INSERT [dbo].[MonHoc] ([MaMonHoc], [TenMonHoc], [NgayBatDau], [NgayKetThuc], [MaChuyenNganh], [MaNhanVien], [HocPhi], [HocKy]) VALUES (N'MOB202', N'Thiết kế giao diện trên Android ', CAST(N'2021-01-01' AS Date), CAST(N'2021-12-01' AS Date), N'IT-LT', N'TEONV', 300000, N'FALL2021 ')
INSERT [dbo].[MonHoc] ([MaMonHoc], [TenMonHoc], [NgayBatDau], [NgayKetThuc], [MaChuyenNganh], [MaNhanVien], [HocPhi], [HocKy]) VALUES (N'SOF102', N'THIẾT KẾ PHẦN MỀM', CAST(N'2021-01-01' AS Date), CAST(N'2021-12-01' AS Date), N'IT-LT', N'TEONV', 6000000, N'FALL2021')
INSERT [dbo].[MonHoc] ([MaMonHoc], [TenMonHoc], [NgayBatDau], [NgayKetThuc], [MaChuyenNganh], [MaNhanVien], [HocPhi], [HocKy]) VALUES (N'SOF2041', N'DỰ ÁN MẪU', CAST(N'2021-01-01' AS Date), CAST(N'2021-12-10' AS Date), N'IT-LT', N'TEONV', 3000000, N'FALL2021')
INSERT [dbo].[MonHoc] ([MaMonHoc], [TenMonHoc], [NgayBatDau], [NgayKetThuc], [MaChuyenNganh], [MaNhanVien], [HocPhi], [HocKy]) VALUES (N'WEB021', N'Thiết kế WEB', CAST(N'2021-01-01' AS Date), CAST(N'2021-02-01' AS Date), N'IT-LT', N'TEONV', 9000000, N'FALL2021')
GO
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [SDT], [Email], [DiaChi], [NgaySinh], [GioiTinh], [MaChuyenNganh], [Hinh], [MaTaiKhoan]) VALUES (N'NV00001', N'Nguyễn Văn Tèo', N'0312345987', N'teo123@gmail.com', N'123 Phạm Văn Đồng Quận Phú Nhuận', CAST(N'1999-10-01' AS Date), 0, N'IT-LT', N'nhanvien2.jpg', N'admin')
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [SDT], [Email], [DiaChi], [NgaySinh], [GioiTinh], [MaChuyenNganh], [Hinh], [MaTaiKhoan]) VALUES (N'NV00002', N'Đinh Văn Lâm', N'0289871016', N'lam123@gmail.com', N'78 Nguyễn Hữu Tiến Quận Tân Phú', CAST(N'1998-10-01' AS Date), 0, N'CKDT-TDH', N'nhanvien3.jpg', N'admin')
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [SDT], [Email], [DiaChi], [NgaySinh], [GioiTinh], [MaChuyenNganh], [Hinh], [MaTaiKhoan]) VALUES (N'NV00003', N'Nguyễn Thị Nở', N'0221716690', N'no123@gmail.com', N'30 Tân Thắng Quận Tân Phú', CAST(N'2000-12-08' AS Date), 1, N'TMLD', N'nhanvien4 (1).jpg', N'admin')
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [SDT], [Email], [DiaChi], [NgaySinh], [GioiTinh], [MaChuyenNganh], [Hinh], [MaTaiKhoan]) VALUES (N'NV00004', N'Đinh Văn Tâm', N'0863063947', N'tam123@gmail.com', N'36 Đỗ Nhuận Quận Tân Phú', CAST(N'1998-09-25' AS Date), 1, N'IT-LT', N'nhanvien4 (2).jpg', N'admin')
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [SDT], [Email], [DiaChi], [NgaySinh], [GioiTinh], [MaChuyenNganh], [Hinh], [MaTaiKhoan]) VALUES (N'NV00005', N'Trần Tuấn Anh', N'0443203442', N'anh123@gmail.com', N'255 Thới Hòa Hóc Môn', CAST(N'2001-09-12' AS Date), 1, N'IT-LT', N'nhanvien4 (3).jpg', N'admin')
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [SDT], [Email], [DiaChi], [NgaySinh], [GioiTinh], [MaChuyenNganh], [Hinh], [MaTaiKhoan]) VALUES (N'NV00006', N'Nguyễn Văn Long', N'0445489452', N'long123@gmail.com', N'67 Nguyễn Kiệm Quận Phú Nhuận', CAST(N'1997-05-14' AS Date), 0, N'DL-NH-KS', N'1', N'admin')
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [SDT], [Email], [DiaChi], [NgaySinh], [GioiTinh], [MaChuyenNganh], [Hinh], [MaTaiKhoan]) VALUES (N'NV00007', N'Trần Văn Nam', N'0446845112', N'nam123@gmail.com', N'45 Nguyễn Kiệm Quận Phú Nhuận', CAST(N'1995-08-24' AS Date), 0, N'DL-NH-KS', N'1', NULL)
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [SDT], [Email], [DiaChi], [NgaySinh], [GioiTinh], [MaChuyenNganh], [Hinh], [MaTaiKhoan]) VALUES (N'NV00008', N'Trần Ngọc Huyền', N'0456768453', N'huyen123@gmail.com', N'60 Huỳnh Khương An Quận Gò Vấp', CAST(N'2000-11-23' AS Date), 0, N'KT-KD', N'123', NULL)
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [SDT], [Email], [DiaChi], [NgaySinh], [GioiTinh], [MaChuyenNganh], [Hinh], [MaTaiKhoan]) VALUES (N'NV00009', N'Hồ Tuấn Kiệt', N'0455126521', N'kiet123@gmail.com', N'78 Quang Trung Quận Gò Vấp', CAST(N'2000-02-05' AS Date), 0, N'CKDT-TDH', N'123', NULL)
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [SDT], [Email], [DiaChi], [NgaySinh], [GioiTinh], [MaChuyenNganh], [Hinh], [MaTaiKhoan]) VALUES (N'NV00010', N'Trần Ngọc Phúc', N'0164513312', N'phuc123@gmail.com', N'5 Huỳnh Thúc Kháng Quận Gò Vấp', CAST(N'1996-11-06' AS Date), 0, N'IT-LT', N'123', NULL)
INSERT [dbo].[NhanVien] ([MaNhanVien], [TenNhanVien], [SDT], [Email], [DiaChi], [NgaySinh], [GioiTinh], [MaChuyenNganh], [Hinh], [MaTaiKhoan]) VALUES (N'TEONV', N'TEONV', N'09213214123', N'TEO@GMAIL.COM', N'TP.HCM', CAST(N'1990-09-21' AS Date), 1, N'TKDH', NULL, NULL)
GO
INSERT [dbo].[SinhVien] ([MaSinhVien], [TenSinhVien], [NgaySinh], [Email], [SDT], [DiaChi], [GioiTinh], [MaChuyenNganh], [MaLopHoc], [Hinh], [MaTaiKhoan]) VALUES (N'PD04328', N'Nguyễn Phạm Hùng Phi', CAST(N'2001-11-23' AS Date), N'phinphpd04328@fpt.edu.vn', N'0942232873', N'Ðak Lak', 1, N'TKDH', N'TKDH01', N'anh3.jpg', N'PD04328')
INSERT [dbo].[SinhVien] ([MaSinhVien], [TenSinhVien], [NgaySinh], [Email], [SDT], [DiaChi], [GioiTinh], [MaChuyenNganh], [MaLopHoc], [Hinh], [MaTaiKhoan]) VALUES (N'PD09231', N'Nguyễn ABC', CAST(N'2021-11-19' AS Date), N'ABC@gmail.com', N'0921931232', N'Đak Lak', 1, N'IT-LT', N'F101', NULL, NULL)
INSERT [dbo].[SinhVien] ([MaSinhVien], [TenSinhVien], [NgaySinh], [Email], [SDT], [DiaChi], [GioiTinh], [MaChuyenNganh], [MaLopHoc], [Hinh], [MaTaiKhoan]) VALUES (N'Ph04328', N'Nguyễn Phạm Hùng Phi', CAST(N'2001-08-11' AS Date), N'phinpshpd04328@fpt.edu.vn', N'094223273', N'Đak Lak', 1, N'TKDH', N'TKDH01', N'images (1).jpg', NULL)
INSERT [dbo].[SinhVien] ([MaSinhVien], [TenSinhVien], [NgaySinh], [Email], [SDT], [DiaChi], [GioiTinh], [MaChuyenNganh], [MaLopHoc], [Hinh], [MaTaiKhoan]) VALUES (N'PP11122', N'Trần Kim Long', CAST(N'2001-08-19' AS Date), N'longtkpp11122@fpt.edu.vn', N'0957564285', N'Tây Ninh', 1, N'KT-KD', N'IT17315', N'images (2).jpg', NULL)
INSERT [dbo].[SinhVien] ([MaSinhVien], [TenSinhVien], [NgaySinh], [Email], [SDT], [DiaChi], [GioiTinh], [MaChuyenNganh], [MaLopHoc], [Hinh], [MaTaiKhoan]) VALUES (N'PS09821', N'Nguyễn Bá Sinh', CAST(N'2021-11-11' AS Date), N'sinhbnps09821@fpt.edu.vn', N'0987698213', N'Quận 8, TP.HCM', 1, N'IT-LT', N'IT16302', N'images (1).jpg', NULL)
INSERT [dbo].[SinhVien] ([MaSinhVien], [TenSinhVien], [NgaySinh], [Email], [SDT], [DiaChi], [GioiTinh], [MaChuyenNganh], [MaLopHoc], [Hinh], [MaTaiKhoan]) VALUES (N'PS11002', N'Trần Đình Nguyên', CAST(N'2001-12-11' AS Date), N'nguyentdps11002@fpt.edu.vn', N'0365524489', N'Đak Lak', 1, N'TKDH', N'IT17315', N'images (3).jpg', NULL)
INSERT [dbo].[SinhVien] ([MaSinhVien], [TenSinhVien], [NgaySinh], [Email], [SDT], [DiaChi], [GioiTinh], [MaChuyenNganh], [MaLopHoc], [Hinh], [MaTaiKhoan]) VALUES (N'PS11139', N'Đặng Tiểu Hoàng', CAST(N'2001-03-07' AS Date), N'hoangdtps11139@fpt.edu.vn', N'0356458259', N'Gia Lai', 1, N'IT-LT', N'IT16302', N'images (4).jpg', NULL)
INSERT [dbo].[SinhVien] ([MaSinhVien], [TenSinhVien], [NgaySinh], [Email], [SDT], [DiaChi], [GioiTinh], [MaChuyenNganh], [MaLopHoc], [Hinh], [MaTaiKhoan]) VALUES (N'PS11222', N'Hoàng Phi Long', CAST(N'2001-04-16' AS Date), N'longhpps112222@fpt.edu.vn', N'0375578894', N'Bình Phước', 1, N'IT-LT', N'F101', N'images (5).jpg', NULL)
INSERT [dbo].[SinhVien] ([MaSinhVien], [TenSinhVien], [NgaySinh], [Email], [SDT], [DiaChi], [GioiTinh], [MaChuyenNganh], [MaLopHoc], [Hinh], [MaTaiKhoan]) VALUES (N'PS11223', N'Hoàng Xuân Liên', CAST(N'2001-02-01' AS Date), N'lienhxps11223@fpt.edu.vn', N'0355666999', N'Long An', 0, N'IT-LT', N'IT17315', N'images.jpg', NULL)
INSERT [dbo].[SinhVien] ([MaSinhVien], [TenSinhVien], [NgaySinh], [Email], [SDT], [DiaChi], [GioiTinh], [MaChuyenNganh], [MaLopHoc], [Hinh], [MaTaiKhoan]) VALUES (N'PS13120', N'Bùi Quốc Trị', CAST(N'2001-05-16' AS Date), N'tribqps13120@fpt.edu.vn', N'0351235598', N'Bình Dương', 1, N'KT-KD', N'IT17314', N't?i xu?ng (1).jpg', NULL)
INSERT [dbo].[SinhVien] ([MaSinhVien], [TenSinhVien], [NgaySinh], [Email], [SDT], [DiaChi], [GioiTinh], [MaChuyenNganh], [MaLopHoc], [Hinh], [MaTaiKhoan]) VALUES (N'PS13130', N'Trương Minh Phúc', CAST(N'2001-11-04' AS Date), N'phuctmps13130@fpt.edu.vn', N'0376367400', N'Gia Lai', 1, N'TKDH', N'IT17315', N't?i xu?ng (2).jpg', NULL)
INSERT [dbo].[SinhVien] ([MaSinhVien], [TenSinhVien], [NgaySinh], [Email], [SDT], [DiaChi], [GioiTinh], [MaChuyenNganh], [MaLopHoc], [Hinh], [MaTaiKhoan]) VALUES (N'PS13132', N'Lãnh Quốc Khánh', CAST(N'2001-09-17' AS Date), N'khanhlqps13132@fpt.edu.vn', N'0386812510', N'Bình Phước', 1, N'IT-LT', N'F101', N't?i xu?ng.jpg', NULL)
INSERT [dbo].[SinhVien] ([MaSinhVien], [TenSinhVien], [NgaySinh], [Email], [SDT], [DiaChi], [GioiTinh], [MaChuyenNganh], [MaLopHoc], [Hinh], [MaTaiKhoan]) VALUES (N'PS13245', N'Võ Chí Hảo', CAST(N'2001-01-28' AS Date), N'haovcps13245@fpt.edu.vn', N'0321546879', N'Tiền Giang', 1, N'IT-LT', N'IT16303', N'anh6.jpeg', NULL)
INSERT [dbo].[SinhVien] ([MaSinhVien], [TenSinhVien], [NgaySinh], [Email], [SDT], [DiaChi], [GioiTinh], [MaChuyenNganh], [MaLopHoc], [Hinh], [MaTaiKhoan]) VALUES (N'PS22222', N'Nguyễn Lộc Tin', CAST(N'2001-01-11' AS Date), N'tinnlps22222@fpt.edu.vn', N'0369396639', N'Quảng Ngãi', 1, N'IT-LT', N'F101', N'anh8.jpeg', NULL)
INSERT [dbo].[SinhVien] ([MaSinhVien], [TenSinhVien], [NgaySinh], [Email], [SDT], [DiaChi], [GioiTinh], [MaChuyenNganh], [MaLopHoc], [Hinh], [MaTaiKhoan]) VALUES (N'PT11223', N'Nguyễn Thị Tuyết HOA', CAST(N'2001-12-11' AS Date), N'hoanttpt11223@fpt.edu.vn', N'0356235876', N'Tiền Giang', 0, N'IT-LT', N'F101', N'anh5.jpeg', NULL)
INSERT [dbo].[SinhVien] ([MaSinhVien], [TenSinhVien], [NgaySinh], [Email], [SDT], [DiaChi], [GioiTinh], [MaChuyenNganh], [MaLopHoc], [Hinh], [MaTaiKhoan]) VALUES (N'PT22111', N'Nguyễn Thị Thu Hiền', CAST(N'2001-11-08' AS Date), N'hiennttpt22111@fpt.edu.vn', N'0396696379', N'TP-HCM', 0, N'IT-LT', N'F101', N'anh11.jpeg', NULL)
INSERT [dbo].[SinhVien] ([MaSinhVien], [TenSinhVien], [NgaySinh], [Email], [SDT], [DiaChi], [GioiTinh], [MaChuyenNganh], [MaLopHoc], [Hinh], [MaTaiKhoan]) VALUES (N'PT22112', N'Trần Thị Bích Phượng', CAST(N'2001-09-11' AS Date), N'phuongttbpt22112@fpt.edu.vn', N'0354989999', N'Kontum', 0, N'IT-LT', N'IT17309', N'anh14.jpeg', NULL)
GO
INSERT [dbo].[TaiKhoan] ([MaTaiKhoan], [TenDangNhap], [MatKhau], [VaiTro]) VALUES (N'admin', N'admin', N'123', 0)
INSERT [dbo].[TaiKhoan] ([MaTaiKhoan], [TenDangNhap], [MatKhau], [VaiTro]) VALUES (N'PD04328', N'NguyenPhamHungPhi', N'123', 2)
INSERT [dbo].[TaiKhoan] ([MaTaiKhoan], [TenDangNhap], [MatKhau], [VaiTro]) VALUES (N'PS16357', N'NguyenNhuTai', N'123', 2)
INSERT [dbo].[TaiKhoan] ([MaTaiKhoan], [TenDangNhap], [MatKhau], [VaiTro]) VALUES (N'PS18774', N'DoMinhLuat', N'123', 2)
INSERT [dbo].[TaiKhoan] ([MaTaiKhoan], [TenDangNhap], [MatKhau], [VaiTro]) VALUES (N'PS18777', N'NguyenThiMaiThuong', N'123', 2)
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ__NhanVien__A9D10534B05B950B]    Script Date: 11/30/2021 12:09:18 PM ******/
ALTER TABLE [dbo].[NhanVien] ADD UNIQUE NONCLUSTERED 
(
	[Email] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ__NhanVien__CA1930A560801558]    Script Date: 11/30/2021 12:09:18 PM ******/
ALTER TABLE [dbo].[NhanVien] ADD UNIQUE NONCLUSTERED 
(
	[SDT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ__SinhVien__A9D105340B395DDC]    Script Date: 11/30/2021 12:09:18 PM ******/
ALTER TABLE [dbo].[SinhVien] ADD UNIQUE NONCLUSTERED 
(
	[Email] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ__SinhVien__CA1930A5F1E367E3]    Script Date: 11/30/2021 12:09:18 PM ******/
ALTER TABLE [dbo].[SinhVien] ADD UNIQUE NONCLUSTERED 
(
	[SDT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
ALTER TABLE [dbo].[LopHoc] ADD  DEFAULT (NULL) FOR [NgayDangKy]
GO
ALTER TABLE [dbo].[MonHoc] ADD  DEFAULT (NULL) FOR [NgayBatDau]
GO
ALTER TABLE [dbo].[DIEM]  WITH CHECK ADD  CONSTRAINT [FK_DIEM_MonHoc1] FOREIGN KEY([MaMH])
REFERENCES [dbo].[MonHoc] ([MaMonHoc])
GO
ALTER TABLE [dbo].[DIEM] CHECK CONSTRAINT [FK_DIEM_MonHoc1]
GO
ALTER TABLE [dbo].[DIEM]  WITH CHECK ADD  CONSTRAINT [FK_DIEM_SinhVien] FOREIGN KEY([MaSV])
REFERENCES [dbo].[SinhVien] ([MaSinhVien])
GO
ALTER TABLE [dbo].[DIEM] CHECK CONSTRAINT [FK_DIEM_SinhVien]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_ChuyenNganh] FOREIGN KEY([MaChuyenNganhSV])
REFERENCES [dbo].[ChuyenNganh] ([MaChuyenNganh])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_ChuyenNganh]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_HocKy] FOREIGN KEY([HocKy])
REFERENCES [dbo].[HocKy] ([MaHocKy])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_HocKy]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_NhanVien] FOREIGN KEY([MaNhanVien])
REFERENCES [dbo].[NhanVien] ([MaNhanVien])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_NhanVien]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_SinhVien] FOREIGN KEY([MaSinhVien])
REFERENCES [dbo].[SinhVien] ([MaSinhVien])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_SinhVien]
GO
ALTER TABLE [dbo].[LichHoc]  WITH CHECK ADD  CONSTRAINT [FK_LichHoc_ChuyenNganh] FOREIGN KEY([MaChuyenNganh])
REFERENCES [dbo].[ChuyenNganh] ([MaChuyenNganh])
GO
ALTER TABLE [dbo].[LichHoc] CHECK CONSTRAINT [FK_LichHoc_ChuyenNganh]
GO
ALTER TABLE [dbo].[LichHoc]  WITH CHECK ADD  CONSTRAINT [FK_LichHoc_LopHoc] FOREIGN KEY([MaLopHoc])
REFERENCES [dbo].[LopHoc] ([MaLopHoc])
GO
ALTER TABLE [dbo].[LichHoc] CHECK CONSTRAINT [FK_LichHoc_LopHoc]
GO
ALTER TABLE [dbo].[LichHoc]  WITH CHECK ADD  CONSTRAINT [FK_LichHoc_MonHoc] FOREIGN KEY([MaMonHoc])
REFERENCES [dbo].[MonHoc] ([MaMonHoc])
GO
ALTER TABLE [dbo].[LichHoc] CHECK CONSTRAINT [FK_LichHoc_MonHoc]
GO
ALTER TABLE [dbo].[LichHoc]  WITH CHECK ADD  CONSTRAINT [FK_LichHoc_NhanVien] FOREIGN KEY([MaNhanVien])
REFERENCES [dbo].[NhanVien] ([MaNhanVien])
GO
ALTER TABLE [dbo].[LichHoc] CHECK CONSTRAINT [FK_LichHoc_NhanVien]
GO
ALTER TABLE [dbo].[LopHoc]  WITH CHECK ADD  CONSTRAINT [FK_LopHoc_ChuyenNganh] FOREIGN KEY([MaChuyenNganh])
REFERENCES [dbo].[ChuyenNganh] ([MaChuyenNganh])
GO
ALTER TABLE [dbo].[LopHoc] CHECK CONSTRAINT [FK_LopHoc_ChuyenNganh]
GO
ALTER TABLE [dbo].[LopHoc]  WITH CHECK ADD  CONSTRAINT [FK_LopHoc_NhanVien] FOREIGN KEY([MaNhanVien])
REFERENCES [dbo].[NhanVien] ([MaNhanVien])
GO
ALTER TABLE [dbo].[LopHoc] CHECK CONSTRAINT [FK_LopHoc_NhanVien]
GO
ALTER TABLE [dbo].[MonHoc]  WITH CHECK ADD  CONSTRAINT [FK_MonHoc_ChuyenNganh] FOREIGN KEY([MaChuyenNganh])
REFERENCES [dbo].[ChuyenNganh] ([MaChuyenNganh])
GO
ALTER TABLE [dbo].[MonHoc] CHECK CONSTRAINT [FK_MonHoc_ChuyenNganh]
GO
ALTER TABLE [dbo].[MonHoc]  WITH CHECK ADD  CONSTRAINT [FK_MonHoc_HocKy] FOREIGN KEY([HocKy])
REFERENCES [dbo].[HocKy] ([MaHocKy])
GO
ALTER TABLE [dbo].[MonHoc] CHECK CONSTRAINT [FK_MonHoc_HocKy]
GO
ALTER TABLE [dbo].[MonHoc]  WITH CHECK ADD  CONSTRAINT [FK_MonHoc_NhanVien] FOREIGN KEY([MaNhanVien])
REFERENCES [dbo].[NhanVien] ([MaNhanVien])
GO
ALTER TABLE [dbo].[MonHoc] CHECK CONSTRAINT [FK_MonHoc_NhanVien]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_ChuyenNganh] FOREIGN KEY([MaChuyenNganh])
REFERENCES [dbo].[ChuyenNganh] ([MaChuyenNganh])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_ChuyenNganh]
GO
ALTER TABLE [dbo].[NhanVien]  WITH CHECK ADD  CONSTRAINT [FK_NhanVien_TaiKhoan] FOREIGN KEY([MaTaiKhoan])
REFERENCES [dbo].[TaiKhoan] ([MaTaiKhoan])
GO
ALTER TABLE [dbo].[NhanVien] CHECK CONSTRAINT [FK_NhanVien_TaiKhoan]
GO
ALTER TABLE [dbo].[SinhVien]  WITH CHECK ADD  CONSTRAINT [FK_SinhVien_ChuyenNganh] FOREIGN KEY([MaChuyenNganh])
REFERENCES [dbo].[ChuyenNganh] ([MaChuyenNganh])
GO
ALTER TABLE [dbo].[SinhVien] CHECK CONSTRAINT [FK_SinhVien_ChuyenNganh]
GO
ALTER TABLE [dbo].[SinhVien]  WITH CHECK ADD  CONSTRAINT [FK_SinhVien_TaiKhoan] FOREIGN KEY([MaTaiKhoan])
REFERENCES [dbo].[TaiKhoan] ([MaTaiKhoan])
GO
ALTER TABLE [dbo].[SinhVien] CHECK CONSTRAINT [FK_SinhVien_TaiKhoan]
GO
