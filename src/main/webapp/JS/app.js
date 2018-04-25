Ext.onReady(function(){

    Ext.create('Ext.panel.Panel', 

        {

            title: 'XXXX系统',

            renderTo: Ext.getBody(),
//         	region:'center',

            width: 1600,

            height: 800,

            layout: 'border',

            defaults: 

                {

                 split: true,                  //是否有分割线

                    collapsible: true,           //是否可以折叠

                    bodyStyle: 'padding:15px'  

                },  

            items: [

//                    { 子元素的方位分别对应屏幕上下左右中：north、south、west、east、center     
//						例如	region: 'north', 
//
//                        title: '北',
//
//                        xtype: "panel",
//
//                        html: "子元素1",
//
//                        height: 70
//
//                    },

                    {

                        region: 'west',
                        title: '目录',
//                        xtype: "panel",
                        layout: "accordion",
                        split: true,
                        collapsible: true,
                        items: [
                                    { title: "首页", html: "二级菜单"},			//一级菜单，
                                    { title: "管理", html: "用户管理"},
                                    { title: "设置", html: "二级菜单"},
                                    { title: "留言", html: "二级菜单"}
                               ],                         
                        width: 200

                    },
                    {

                        region: 'center',
                        title: '明细',
                        xtype: "panel",

//                        html: "子元素3"				//这里做成详细表格

                    },

                    {
                        region: 'south',
                        title: '友情链接',
                        titleAlign: 'center',
                        xtype: "panel",
                        height: 70,              

                        html: "<a href=https://www.baidu.com/>百度</a>"  
                        

                    }

                   ]

        });

});