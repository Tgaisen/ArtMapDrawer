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
4. 重新放置画架，面朝画架，使用指令`/artmapdrawer draw <画布 ID> <图像路径（需去掉前后引号）>`获取染料清单与预览。例如`/artmapdrawer 12345 D:\123.png`
4. 收集需要的染料。  
    >注：需要的染料会在容器中高亮显示以方便拿取。
5. 将画布挂上画布并与画架交互，按下`开始/暂停绘制`键（默认为小键盘 1）开始绘制。  
    >注：开始绘制后，如果画架与自动绘制的朝向不一致，需要暂停绘制，打掉画架并重新按照自动绘制的朝向摆放。
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

## 如何获取画布 ID
1. 安装 R 键整理（Inventory Profiles Next）模组。
2. 进入 R 键整理的设置页面（可通过按`E`打开物品栏，点击左上角`三个横杠`按钮进入）→点击左侧栏下方的`热键`→滑倒底部→找到`输出物品 NBT 到聊天栏`→绑定一个热键。
3. 将一个新画布放在画架上，`右键`画架直到画布变成白色。
4. `Shift + 右键`画架取下画布，拾取画布，按`E`打开物品栏。
5. 鼠标指向拾取的画布，按下第 2 步绑定的按键。
6. 此时聊天栏会输出画布的 NBT，滑到底部找到带有“minecraft:map_id”的一行。
7. 找到这一行里的“[id=xxxxx]”内容，例如“[id=12345]”，“12345”就是这个画布的 ID。

## 注
* 模组需要依赖库 Cloth Config API。
