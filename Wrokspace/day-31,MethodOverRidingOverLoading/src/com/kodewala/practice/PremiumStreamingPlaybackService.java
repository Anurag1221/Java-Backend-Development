package com.kodewala.practice;

//Method overloading + Method OverRiding
class StreamingPlaybackService {

	public void playVideo(String videoId) {

		System.out.println("StreamingPlaybackService.playVideo(String videoId)");
	}

	public void playVideo(String videoId, int resolution) {

		System.out.println("StreamingPlaybackService.playVideo(String videoId, int resolution)");
	}
}

public class PremiumStreamingPlaybackService extends StreamingPlaybackService {

	@Override
	public void playVideo(String videoId) {

		System.out.println("PremiumStreamingPlaybackService.playVideo()");
	}
	
	@Override
	public void playVideo(String videoId, int resolution) {
		
		System.out.println("PremiumStreamingPlaybackService.playVideo()");
	}
}

//Q6 · Intermediate · Both concepts
//Video Streaming Quality
//
//Classes: StreamingPlaybackService, PremiumStreamingPlaybackService
//
//A video platform supports standard playback and premium playback with enhanced quality.
//
//Requirements:
//1. Create playVideo(String videoId) in the parent class.
//2. Create playVideo(String videoId, int resolution) in the parent class.
//3. Override playVideo(String videoId) in the child class.
//4. Override playVideo(String videoId, int resolution) in the child class.
//5. Print different playback messages for standard and premium streaming.
//6. Call both methods using a child-class object.
//New concept: The same method name can have multiple parameter lists, and the child can provide its own implementations.
