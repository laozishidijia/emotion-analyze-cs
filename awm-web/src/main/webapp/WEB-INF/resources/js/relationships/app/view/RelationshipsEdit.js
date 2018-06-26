Ext.define('relationships.view.RelationshipsEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.relationshipsEdit',
	title : '编辑联系信息',
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
				name : 'relationshipId',
				fieldLabel : 'RELATIONSHIPID'
			}, {
				xtype : 'textfield',
				name : 'predicate',
				fieldLabel : 'PREDICATE'
			}, {
				xtype : 'textfield',
				name : 'synsets',
				fieldLabel : 'SYNSETS'
			},{
				xtype : 'textfield',
				name : 'image_id',
				fieldLabel : 'IMAGE_ID'
			},{
				xtype : 'textfield',
				name : 'object_id',
				fieldLabel : 'OBJECT_ID'
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
