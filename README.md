# ArtMapDrawer for DripDrop
这是 Mod [drawler](https://github.com/miniking1000/drawler) 的 Fork 版本，适配 DripDrop 服务器尺寸为 32×32 的 ArtMap，同时做了一些其他修改。  
This is a fork of Mod [drawler](https://github.com/miniking1000/drawler), adapted to the 32×32 ArtMap size of the DripDrop server, and made some other modifications.

## 获取
请前往项目的 [Releases](https://github.com/Tgaisen/ArtMapDrawer/releases) 页面获取

## 修改
* 图片来源改为本地
* 添加简体中文语言
* 适配 ModMenu 配置入口
* 集成指令至`/artmapdrawer`

## 通用步骤
1. 将需要绘制的图像保存至电脑，并获得此图片的路径（可右键图片→点击右键菜单中的`复制文件路径`来获得）。  
    >注：画布分辨率为 32×32，绘制高分辨率图片会糊成一坨，建议使用 PS 把图片分割成多块，分别绘制，再拼成一块。
2. 进入游戏，把一张新画布放在画架上，`右键`画架，待画布变白后`Shift + 右键`移除画架，取下并拾取画布。
3. 把画布拿在主手上，使用指令`/artmapdrawer getmapid`获取画布 ID。
4. 重新放置画架，使用指令`/artmapdrawer draw <画布 ID> <图像路径（需去掉前后引号）>`获取染料清单与预览。例如`/artmapdrawer 12345 D:\123.png`
4. 收集需要的染料。  
   >注：需要的染料会在容器中高亮显示以方便拿取。
5. 将画布挂上画布并与画架交互，面朝画架，按下`开始/暂停绘制`键（默认为小键盘 1）开始绘制。
   >注：开始绘制前请确保已面朝画架。
6. 绘制完成后会检查是否有绘制错误，检查完成后如果有错误可按下`开始/暂停绘制`键修复错误。

## 按键
* 配置界面：`R`
* 开始/暂停绘制：`小键盘 1`
* 切换效果图显示：`小键盘 2`
* 切换预览图显示：`小键盘 3`

## 指令
* 应用的指令集成在`/artmapdrawer`中
* 开始绘制：`draw`
* 重置状态：`reset`
* 获取画布 ID：`getmapid`
* 检查绘制错误：`checkerror`
* 检查绘画材料：`checkitem`
* 设置绘制位置：`setdrawing`
* 设置视角：`setcamera`

## 注
* 模组需要依赖库 Cloth Config API。
