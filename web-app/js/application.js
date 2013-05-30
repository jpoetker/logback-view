if (typeof jQuery !== 'undefined') {
	(function($) {
		$('i').tooltip();
		$('#spinner').ajaxStart(function() {
			$(this).fadeIn();
		}).ajaxStop(function() {
			$(this).fadeOut();
		});
	})(jQuery);
}
