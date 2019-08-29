package com.hamza.stock.dao.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import javax.swing.JOptionPane;

import org.scribe.model.Token;
import org.scribe.model.Verifier;

import com.flickr4java.flickr.Flickr;
import com.flickr4java.flickr.FlickrException;
import com.flickr4java.flickr.REST;
import com.flickr4java.flickr.RequestContext;
import com.flickr4java.flickr.auth.Auth;
import com.flickr4java.flickr.auth.AuthInterface;
import com.flickr4java.flickr.auth.Permission;
import com.flickr4java.flickr.uploader.UploadMetaData;
import com.flickr4java.flickr.util.IOUtilities;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.model.OAuth1RequestToken;
import com.github.scribejava.core.model.OAuth1Token;
import com.github.scribejava.core.oauth.OAuth10aService;
import com.hamza.stock.dao.IFlickrDao;

public class FlickrDaoImpl implements IFlickrDao {
	
	private Flickr flickr;

    private UploadMetaData uploadMetaData = new UploadMetaData();

    private static String apiKey = "4cc94e8fd9582a8a9857510621cc30c3";

    private static String sharedSecret = "22230453c0e21cea";
    
    


    private void connect(){
        flickr = new Flickr(apiKey, sharedSecret, new REST());
        Auth auth = new Auth();
        auth.setPermission(Permission.READ);
        auth.setToken("72157710602857948-a31fc23bcbf9bb9b");
        auth.setTokenSecret("72c3acb23b590d1b");
        RequestContext requestContext = RequestContext.getRequestContext();
        requestContext.setAuth(auth);
        flickr.setAuth(auth);
    }

    @Override
    public String savePhoto(InputStream photo, String title) throws Exception{
        connect();
        uploadMetaData.setTitle(title);
        String photoId = flickr.getUploader().upload(photo, uploadMetaData);
        return flickr.getPhotosInterface().getPhoto(photoId).getMedium640Url();
    }
    
   
        
    	

    public static void auth() throws IOException, FlickrException, ExecutionException, InterruptedException {

        Flickr flickr = new Flickr(apiKey, sharedSecret, new REST());
        Flickr.debugStream = false;
        AuthInterface authInterface = flickr.getAuthInterface();

        Scanner scanner = new Scanner(System.in);

        OAuth1RequestToken requestToken = authInterface.getRequestToken();
        System.out.println("token: " + requestToken);

        String url = authInterface.getAuthorizationUrl(requestToken, Permission.DELETE);
        System.out.println("Follow this URL to authorise yourself on Flickr");
        System.out.println(url);
        System.out.println("Paste in the token it gives you:");
        System.out.print(">>");

        String tokenKey = JOptionPane.showInputDialog(null);
        OAuth1Token accessToken = authInterface.getAccessToken(requestToken, tokenKey);
        System.out.println("Authentication success");

        Auth auth = authInterface.checkToken(accessToken);

        // This token can be used until the user revokes it.
        System.out.println("Token: " + accessToken.getToken());
        System.out.println("Secret: " + accessToken.getTokenSecret());
        System.out.println("nsid: " + auth.getUser().getId());
        System.out.println("Realname: " + auth.getUser().getRealName());
        System.out.println("Username: " + auth.getUser().getUsername());
        System.out.println("Permission: " + auth.getPermission().getType());

    
}
    }
