
    function uploadFile() {
    
        if($('#filex').val() == '') {
            alert('업로드할 파일을 선택하세요.');
            $('#filex').focus();
            return false;
        } else {
            document.mainx.action="fileupload_image2_m.asp";
            document.mainx.submit();
        }
        
    }
    
    $(document).ready(function() {
        
        
    
    });

