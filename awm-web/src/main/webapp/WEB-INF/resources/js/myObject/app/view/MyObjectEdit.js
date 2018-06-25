Ext.define('myObject.view.MyObjectEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.myObjectEdit',
	title : '编辑对象信息',
	layout : 'fit',
	autoShow : true,
	initComponent : function() {
		this.items = [ {
			xtype : 'form',
			height : 300,
			width : 300,
			border : false,
			items : [{
				xtype : 'textfield',
				name : 'h',
				fieldLabel : 'H'
			}, {
				xtype : 'textfield',
				name : 'merged_object_ids',
				fieldLabel : 'MERGED_OBJECT_IDS'
			}, {
				xtype : 'textfield',
				name : 'names',
				fieldLabel : 'NAMES'
			},{
				xtype : 'textfield',
				name : 'object_id',
				fieldLabel : 'OBJECT_ID'
			},{
				xtype : 'textfield',
				name : 'synsets',
				fieldLabel : 'SYNSETS'
			},{
				xtype : 'textfield',
				name : 'w',
				fieldLabel : 'W'
			},{
				xtype : 'textfield',
				name : 'x',
				fieldLabel : 'X'
			},{
				xtype : 'textfield',
				name : 'y',
				fieldLabel : 'Y'
			}
			]
		} ];
		this.buttons = [ {
			text : '保存',
			action : 'save'
		}, {
			text : '取消',
			scope : this,
			handler : this.close
		} ];
		this.callParent(arguments);
	}
});
