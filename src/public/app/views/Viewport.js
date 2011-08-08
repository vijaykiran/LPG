//Main viewport of the application
LPG.views.Viewport = Ext.extend(Ext.Panel, {
    fullscreen: true,
    layout: 'fit',

    initComponent: function() {
        Ext.apply(this, {
                  items: [
                      {html: 'Hello World'}
                  ]
        });

        LPG.views.Viewport.superclass.initComponent.apply(this, arguments);
    }
});
