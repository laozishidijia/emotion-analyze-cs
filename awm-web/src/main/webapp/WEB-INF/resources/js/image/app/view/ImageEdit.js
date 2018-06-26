Ext.define('image.view.ImageEdit', {
	extend : 'Ext.window.Window',
	alias : 'widget.imageEdit',
	title : 'Edit Image Information',
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
				name : 'image_id',
				fieldLabel : 'IMAGE_ID'
			}, {
				xtype : 'textfield',
				name : 'width',
				fieldLabel : 'WIDTH'
			}, {
				xtype : 'textfield',
				name : 'height',
				fieldLabel : 'HEIGHT'
			},{
				xtype : 'textfield',
				name : 'coco_id',
				fieldLabel : 'COCO_ID'
			},{
				xtype : 'textfield',
				name : 'flickr_id',
				fieldLabel : 'FLICKR_ID'
			},{
				xtype : 'textfield',
				name : 'url',
				fieldLabel : 'URL'
			}]
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
