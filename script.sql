USE [master]
GO
/****** Object:  Database [CNPM]    Script Date: 4/14/2023 4:14:50 PM ******/
CREATE DATABASE [CNPM]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'CNPM', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQL2019\MSSQL\DATA\CNPM.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'CNPM_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.SQL2019\MSSQL\DATA\CNPM_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [CNPM] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [CNPM].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [CNPM] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [CNPM] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [CNPM] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [CNPM] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [CNPM] SET ARITHABORT OFF 
GO
ALTER DATABASE [CNPM] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [CNPM] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [CNPM] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [CNPM] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [CNPM] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [CNPM] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [CNPM] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [CNPM] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [CNPM] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [CNPM] SET  DISABLE_BROKER 
GO
ALTER DATABASE [CNPM] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [CNPM] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [CNPM] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [CNPM] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [CNPM] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [CNPM] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [CNPM] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [CNPM] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [CNPM] SET  MULTI_USER 
GO
ALTER DATABASE [CNPM] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [CNPM] SET DB_CHAINING OFF 
GO
ALTER DATABASE [CNPM] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [CNPM] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [CNPM] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [CNPM] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [CNPM] SET QUERY_STORE = OFF
GO
USE [CNPM]
GO
/****** Object:  Table [dbo].[Baocao]    Script Date: 4/14/2023 4:14:50 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Baocao](
	[MaBC] [nchar](10) NOT NULL,
	[TenBC] [nchar](10) NULL,
	[Mahoadon] [nchar](10) NULL,
	[Thoigian] [date] NULL,
	[Doanhthu] [float] NULL,
 CONSTRAINT [PK_Baocao] PRIMARY KEY CLUSTERED 
(
	[MaBC] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[dulieu]    Script Date: 4/14/2023 4:14:50 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[dulieu](
	[taikhoan] [nchar](10) NULL,
	[matkhau] [nchar](10) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 4/14/2023 4:14:50 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[Mahoadon] [nchar](10) NOT NULL,
	[tenhoadon] [nchar](10) NULL,
	[MaNV] [nchar](10) NULL,
	[MaSP] [nchar](10) NULL,
	[Soluong] [nchar](10) NULL,
	[Tongtien] [float] NULL,
 CONSTRAINT [PK_HoaDon] PRIMARY KEY CLUSTERED 
(
	[Mahoadon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhaCC]    Script Date: 4/14/2023 4:14:50 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhaCC](
	[MaNCC] [nchar](10) NOT NULL,
	[TenNCC] [nchar](10) NULL,
	[MaSP] [nchar](10) NULL,
	[Diachi] [nchar](10) NULL,
	[SDT] [nchar](10) NULL,
 CONSTRAINT [PK_NhaCC] PRIMARY KEY CLUSTERED 
(
	[MaNCC] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[quanlinhanvien]    Script Date: 4/14/2023 4:14:50 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[quanlinhanvien](
	[MaNV] [nchar](10) NOT NULL,
	[TenNV] [nchar](10) NULL,
	[Gioitinh] [nchar](10) NULL,
	[Diachi] [nchar](10) NULL,
	[SDT] [nchar](10) NULL,
	[Chucvu] [nchar](10) NULL,
	[Ngaysinh] [date] NULL,
 CONSTRAINT [PK_Nhanvien] PRIMARY KEY CLUSTERED 
(
	[MaNV] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Sanpham]    Script Date: 4/14/2023 4:14:50 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Sanpham](
	[MaSP] [nchar](10) NOT NULL,
	[TenSP] [nchar](10) NULL,
	[Soluong] [nchar](10) NULL,
	[Loai] [nchar](10) NULL,
	[Gia] [float] NULL,
 CONSTRAINT [PK_Sanpham] PRIMARY KEY CLUSTERED 
(
	[MaSP] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[Baocao]  WITH CHECK ADD  CONSTRAINT [FK_Baocao_HoaDon] FOREIGN KEY([Mahoadon])
REFERENCES [dbo].[HoaDon] ([Mahoadon])
GO
ALTER TABLE [dbo].[Baocao] CHECK CONSTRAINT [FK_Baocao_HoaDon]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_Nhanvien] FOREIGN KEY([MaNV])
REFERENCES [dbo].[quanlinhanvien] ([MaNV])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_Nhanvien]
GO
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK_HoaDon_Sanpham] FOREIGN KEY([MaSP])
REFERENCES [dbo].[Sanpham] ([MaSP])
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK_HoaDon_Sanpham]
GO
ALTER TABLE [dbo].[NhaCC]  WITH CHECK ADD  CONSTRAINT [FK_NhaCC_Sanpham] FOREIGN KEY([MaSP])
REFERENCES [dbo].[Sanpham] ([MaSP])
GO
ALTER TABLE [dbo].[NhaCC] CHECK CONSTRAINT [FK_NhaCC_Sanpham]
GO
USE [master]
GO
ALTER DATABASE [CNPM] SET  READ_WRITE 
GO
