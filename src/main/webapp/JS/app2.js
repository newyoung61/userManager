Ext.onReady(function () {  
    Ext.create('Ext.data.Store', {  
        storeId: 'simpsonsStore',  
//        fields: ['name', 'email', 'phone'],  
        fields: ['menu'],
//        fields: 'menu',
        data: {  
            'items': [
					{
						'menu':'用户管理'
						
					},  {
						'menu':'设置管理'
					},  {
						'menu':'其他管理'
							}
					

//                      {  
////                'name': 'Lisa',  
////                    "email": "lisa@simpsons.com",  
//                    "phone": "555-111-1224"  
//            }, {  
////                'name': 'Bart',  
////                    "email": "bart@simpsons.com",  
//                    "phone": "555-222-1234"  
//            }, {  
////                'name': 'Homer',  
////                    "email": "home@simpsons.com",  
//                    "phone": "555-222-1244"  
//            }, {  
////                'name': 'Marge',  
////                    "email": "marge@simpsons.com",  
//                    "phone": "555-222-1254"  
//            }
            ]  
        },  
        proxy: {  
            type: 'memory',  
            reader: {  
                type: 'json',  
                root: 'items'  
            }  
        }  
    });  
  
    Ext.create('Ext.grid.Panel', {  
        title: 'Simpsons',  
        store: Ext.data.StoreManager.lookup('simpsonsStore'),  
        columns: [{  
            text: 'Name',  
            dataIndex: 'name'  
        }, {  
            text: 'Email',  
            dataIndex: 'email',  
            flex: 1  
        }, {  
            text: 'Phone',  
            dataIndex: 'phone'  
        }],  
        height: 400,  
        width: 500,  
        dockedItems: [{ //这里开始  
            xtype: 'toolbar',  
            dock: 'top',  
            items: [{  
                xtype: 'textfield',  
                id: 'gid',  
                name: 'findstr',  
                maxLength: 10,  
                labelWidth: 35,  
                width: 120,  
                fieldLabel: 'Name'  
            }, {  
                xtype: 'textfield',  
                id: 'gname',  
                name: 'findstr',  
                maxLength: 10,  
                labelWidth: 35,  
                fieldLabel: 'Phone'  
            }]  
        }, {  
            xtype: 'toolbar',  
            dock: 'top',  
            items: ['->', {  
                xtype: 'button',  
                text: '查询',  
                handler: function () {  
  
                }  
            }, {  
                xtype: 'button',  
                text: '重置',  
                handler: function () {  
  
                }  
            }]  
  
        }],  
  
  
        renderTo: Ext.getBody()  
    });  
  
});